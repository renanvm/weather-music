package br.com.renan.weathermusic.integration.openweather.dto;

import java.util.List;

public record WeatherResponseDTO(
        CoordDTO coord,
        List<WeatherDTO> weather,
        MainDTO main,
        WindDTO wind,
        SysDTO sys,
        String name
        ) {
}

