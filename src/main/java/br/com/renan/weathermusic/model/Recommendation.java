package br.com.renan.weathermusic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Recommendation {
    private MusicGenre musicGenre;
    private List<MusicRecommendation> musicRecommendationList;
    private String city;
    private double temperature;
    private String weather;
}
