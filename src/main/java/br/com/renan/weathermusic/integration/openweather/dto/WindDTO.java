package br.com.renan.weathermusic.integration.openweather.dto;

import lombok.Data;

@Data
class WindDTO {
    private double speed;
    private int deg;
    private double gust;
}
