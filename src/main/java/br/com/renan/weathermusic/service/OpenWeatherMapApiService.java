package br.com.renan.weathermusic.service;

import br.com.renan.weathermusic.integration.openweather.client.OpenWeatherMapClient;
import br.com.renan.weathermusic.integration.openweather.dto.WeatherResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherMapApiService {

    @Value("${open.weather-map-api-key}")
    private String apiKey;
    private final OpenWeatherMapClient openWeatherMapClient;

    public OpenWeatherMapApiService(OpenWeatherMapClient openWeatherMapClient) {
        this.openWeatherMapClient = openWeatherMapClient;
    }

    public WeatherResponseDTO getWeather(String city){
        return openWeatherMapClient.getWeather(city, apiKey);
    }
}
