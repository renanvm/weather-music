package br.com.renan.weathermusic.integration.client;

import br.com.renan.weathermusic.integration.dto.RecommendationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spotify-api", url = "https://api.spotify.com")
public interface SpotifyApiClient {

    @GetMapping("/v1/recommendations")
    RecommendationDTO getRecommendations(@RequestHeader("Authorization") String authorization, @RequestParam("seed_genres")  String seedGenres, @RequestParam("limit") int limit);

}
