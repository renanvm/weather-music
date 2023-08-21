package br.com.renan.weathermusic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MusicRecommendation {
    private String trackName;
    private String artistName;
    private String albumName;
    private String playLink;
}
