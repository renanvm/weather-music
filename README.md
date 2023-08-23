
# Weather Music

A Spring Boot application recommending Spotify music based on real-time city weather.

## To run this project:

Update src/main/resources/application.properties with your api credentials

```
spotify.client-id=your-client-id
spotify.client-secret=your-client-secret
open.weather-map-api-key=your-api-key

```
Open the terminal, build the docker image and run
```bash
  ./gradlew bootBuildImage
```

```bash
  docker run -p 8080:8080 weather-music:0.0.1-SNAPSHOT
```

## API Reference


```http
  GET http://localhost:8080/weather/music/{city}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `city` | `string` | **Required**|


```json
  {
    "musicGenre": "ELECTRONIC",
    "musicRecommendationList": [
        {
            "trackName": "The Island, Pt. II (Dusk)",
            "artistName": "Pendulum",
            "albumName": "Immersion",
            "playLink": "https://open.spotify.com/track/26s79pNvksAh8tlEembKm3"
        },
        ...
    ],
    "city": "itambaraca",
    "temperature": 36.1,
    "weather": "clear sky"
}
```

