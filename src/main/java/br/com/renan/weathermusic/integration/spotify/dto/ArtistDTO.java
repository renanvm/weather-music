package br.com.renan.weathermusic.integration.spotify.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ArtistDTO(
        @JsonAlias("external_urls") ExternalUrlsDTO externalUrls,
        String name
) {
}
