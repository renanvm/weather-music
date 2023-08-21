package br.com.renan.weathermusic.integration.openweather.client;

import br.com.renan.weathermusic.integration.openweather.dto.WeatherResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "open-weather-map-api", url = "https://api.openweathermap.org")
public interface OpenWeatherMapClient {

    @GetMapping("/data/2.5/weather?q={city}&appid={apiKey}&units=metric")
    WeatherResponseDTO getWeather(@RequestParam("city") String city, @RequestParam("apiKey") String apiKey);
}
