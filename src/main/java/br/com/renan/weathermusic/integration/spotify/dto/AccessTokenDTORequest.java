package br.com.renan.weathermusic.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccessTokenDTORequest {
    @JsonProperty("grant_type")
    private String grantType;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
}

