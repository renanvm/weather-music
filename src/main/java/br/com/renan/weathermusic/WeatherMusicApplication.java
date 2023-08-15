package br.com.renan.weathermusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherMusicApplication.class, args);
    }

}
