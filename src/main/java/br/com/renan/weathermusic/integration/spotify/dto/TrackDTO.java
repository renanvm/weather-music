package br.com.renan.weathermusic.integration.spotify.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record TrackDTO(
        AlbumDTO album,
        List<ArtistDTO> artists,
        @JsonAlias("external_urls") ExternalUrlsDTO externalUrls,
        String name
) {

}
