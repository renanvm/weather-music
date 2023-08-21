package br.com.renan.weathermusic.integration.spotify.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class TrackDTO {
    private AlbumDTO album;
    private List<ArtistDTO> artists;
    @JsonAlias("external_urls")
    private ExternalUrlsDTO externalUrls;
    private String name;
}
