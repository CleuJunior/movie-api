package com.cleonildojr.movies.enums;

import lombok.Getter;

@Getter
public enum Genre {
    ACTION("Action"),
    ADVENTURE("Adventure"),
    COMEDY("Comedy"),
    DANCE("Dance"),
    DRAMA("Drama"),
    MUSICAL("Musical"),
    HORROR("Horror"),
    THRILLER("Thriller"),
    DOCUMENTARY("Documentary");

    private final String genre;

    Genre(String genre) { this.genre = genre; }

}
