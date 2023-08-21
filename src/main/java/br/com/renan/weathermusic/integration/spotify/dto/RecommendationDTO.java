package br.com.renan.weathermusic.integration.spotify.dto;

import lombok.Data;

import java.util.List;

@Data
public class RecommendationDTO {
    private List<TrackDTO> tracks;
}




