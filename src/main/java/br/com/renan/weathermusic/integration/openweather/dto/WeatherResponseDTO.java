package br.com.renan.weathermusic.integration.openweather.dto;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResponseDTO {
    private CoordDTO coord;
    private List<WeatherDTO> weather;
    private MainDTO main;
    private WindDTO wind;
    private SysDTO sys;
    private String name;
}

