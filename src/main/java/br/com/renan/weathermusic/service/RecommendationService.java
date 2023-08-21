package br.com.renan.weathermusic.service;

import br.com.renan.weathermusic.integration.openweather.dto.WeatherResponseDTO;
import br.com.renan.weathermusic.model.MusicGenre;
import br.com.renan.weathermusic.model.Recommendation;
import br.com.renan.weathermusic.model.MusicRecommendation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final OpenWeatherMapApiService openWeatherMapApiService;
    private final SpotifyApiService spotifyApiService;

    public RecommendationService(OpenWeatherMapApiService openWeatherMapApiService, SpotifyApiService spotifyApiService) {
        this.openWeatherMapApiService = openWeatherMapApiService;
        this.spotifyApiService = spotifyApiService;
    }

    public Recommendation getMusicRecommendationByCityWeather(String city) {
        WeatherResponseDTO weather = openWeatherMapApiService.getWeather(city);
        double temperature = weather.getMain().getTemp();
        String description = weather.getWeather().get(0).getDescription();

        MusicGenre musicGenreRecommendation = determineMusicGenreRecommendation(temperature);

        List<MusicRecommendation> musicRecommendations = spotifyApiService.getMusicRecommendations(musicGenreRecommendation);
        return createRecommendation(musicGenreRecommendation, musicRecommendations, city, temperature, description);
    }

    private Recommendation createRecommendation(MusicGenre musicGenre, List<MusicRecommendation> musicRecommendations, String city, double temperature, String description) {
        return new Recommendation(musicGenre, musicRecommendations, city, temperature, description);
    }

    private MusicGenre determineMusicGenreRecommendation(double temperature) {
        if (temperature > 30)
            return MusicGenre.ELECTRONIC;
        if (temperature > 20)
            return MusicGenre.ROCK;
        if (temperature > 10)
            return MusicGenre.POP;

        return MusicGenre.DEFAULT;
    }

}
