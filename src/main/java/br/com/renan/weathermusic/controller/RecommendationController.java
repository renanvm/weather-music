package br.com.renan.weathermusic.controller;

import br.com.renan.weathermusic.model.Recommendation;
import br.com.renan.weathermusic.service.RecommendationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather/music")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping("/{city}")
    public Recommendation getMusicRecommendationByCityWeather(@PathVariable String city) {
        return recommendationService.getMusicRecommendationByCityWeather(city);
    }

}
