package br.com.renan.weathermusic.integration.openweather.dto;

import lombok.Data;

@Data
class SysDTO {
    private String country;
    private long sunrise;
    private long sunset;
}
