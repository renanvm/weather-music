package br.com.renan.weathermusic.integration.openweather.dto;

public record SysDTO(
        String country,
        long sunrise,
        long sunset
) {
}
