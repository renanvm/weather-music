package br.com.renan.weathermusic.integration.openweather.dto;

import lombok.Data;

@Data
public class WeatherDTO {
    private int id;
    private String main;
    private String description;
    private String icon;
}
