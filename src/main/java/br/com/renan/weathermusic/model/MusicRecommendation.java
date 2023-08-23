package br.com.renan.weathermusic.model;

public record MusicRecommendation(
        String trackName,
        String artistName,
        String albumName,
        String playLink
) {
}
