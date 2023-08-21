package br.com.renan.weathermusic.model;

public enum MusicGenre {
    ELECTRONIC("electronic"),
    POP("pop"),
    ROCK("rock"),
    DEFAULT("brazil");

    private final String name;

    MusicGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
