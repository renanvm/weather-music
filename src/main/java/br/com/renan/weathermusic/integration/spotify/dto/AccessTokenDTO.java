package br.com.renan.weathermusic.integration.spotify.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AccessTokenDTO(
        @JsonAlias("access_token") String accessToken,
        @JsonAlias("token_type") String tokenType
) {

}
