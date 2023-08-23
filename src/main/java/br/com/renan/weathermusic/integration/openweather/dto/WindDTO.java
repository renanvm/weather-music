package br.com.renan.weathermusic.integration.openweather.dto;

public record WindDTO(
        double speed,
        int deg,
        double gust
        ) {

}
