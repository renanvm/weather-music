FROM openjdk:17-alpine
WORKDIR /app
COPY target/weather-music.jar /app
EXPOSE 8080
CMD ["java", "-jar", "weather-music.jar"]