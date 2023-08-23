package br.com.renan.weathermusic.integration.openweather.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record MainDTO(
        double temp,
        @JsonAlias("feels_like") double feelsLike,
        @JsonAlias("temp_min") double tempMin,
        @JsonAlias("temp_max") double tempMax,
        int pressure,
        int humidity,
        @JsonAlias("sea_level") int seaLevel,
        @JsonAlias("grnd_level") int grndLevel
) {
}
