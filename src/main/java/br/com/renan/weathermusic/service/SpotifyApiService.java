package br.com.renan.weathermusic.service;

import br.com.renan.weathermusic.integration.spotify.client.SpotifyApiAuthClient;
import br.com.renan.weathermusic.integration.spotify.client.SpotifyApiClient;
import br.com.renan.weathermusic.integration.spotify.dto.AccessTokenDTO;
import br.com.renan.weathermusic.integration.spotify.dto.RecommendationDTO;
import br.com.renan.weathermusic.model.MusicGenre;
import br.com.renan.weathermusic.model.MusicRecommendation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpotifyApiService {

    private static final String GRANT_TYPE = "client_credentials";

    @Value("${spotify.client-id}")
    private String clientId;
    @Value("${spotify.client-secret}")
    private String clientSecret;
    private final SpotifyApiAuthClient spotifyApiAuthClient;
    private final SpotifyApiClient spotifyApiClient;

    public SpotifyApiService(SpotifyApiAuthClient spotifyApiAuthClient, SpotifyApiClient spotifyApiClient) {
        this.spotifyApiAuthClient = spotifyApiAuthClient;
        this.spotifyApiClient = spotifyApiClient;
    }

    public List<MusicRecommendation> getMusicRecommendations(MusicGenre musicGenre) {
        String authorization = getAuthorization();
        int limit = 10;
        return mapRecommendationDTOToMusicRecommendationList(spotifyApiClient.getRecommendations(authorization, musicGenre.getName(), limit));
    }

    private String getAuthorization() {
        AccessTokenDTO spotifyAuthResponse = spotifyApiAuthClient.getAccessToken(GRANT_TYPE, clientId, clientSecret);
        return spotifyAuthResponse.getTokenType() + " " + spotifyAuthResponse.getAccessToken();
    }

    private List<MusicRecommendation> mapRecommendationDTOToMusicRecommendationList(RecommendationDTO recommendationDTO) {
        return recommendationDTO.getTracks().stream()
                .map(trackDTO -> new MusicRecommendation(
                        trackDTO.getName(),
                        trackDTO.getArtists().stream().map(artistDTO -> artistDTO.getName()).collect(Collectors.joining(", ")),
                        trackDTO.getAlbum().getName(),
                        trackDTO.getExternalUrls().getSpotify()
                ))
                .collect(Collectors.toList());
    }

}
