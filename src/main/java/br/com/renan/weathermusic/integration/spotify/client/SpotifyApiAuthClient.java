package br.com.renan.weathermusic.integration.client;

import br.com.renan.weathermusic.integration.dto.AccessTokenDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spotify-api-auth", url = "https://accounts.spotify.com")
public interface SpotifyApiAuthClient {

    @PostMapping(path = "/api/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    AccessTokenDTOResponse getAccessToken(@RequestParam("grant_type") String grantType,
                                          @RequestParam("client_id") String clientId,
                                          @RequestParam("client_secret") String clientSecret);

}
