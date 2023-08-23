package br.com.renan.weathermusic.model;

import java.util.List;

public record Recommendation(
        MusicGenre musicGenre,
        List<MusicRecommendation> musicRecommendationList,
        String city,
        double temperature,
        String weather
) {
}
