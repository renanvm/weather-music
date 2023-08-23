package br.com.renan.weathermusic.integration.openweather.dto;

public record WeatherDTO(
        int id,
        String main,
        String description,
        String icon
) {
}
