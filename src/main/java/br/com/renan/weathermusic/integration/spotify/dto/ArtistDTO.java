package br.com.renan.weathermusic.integration.spotify.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class ArtistDTO {
    @JsonAlias("external_urls")
    private ExternalUrlsDTO externalUrls;
    private String name;
}
