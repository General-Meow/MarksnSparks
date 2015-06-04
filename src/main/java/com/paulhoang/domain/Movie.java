package com.paulhoang.domain;

import java.util.Date;

/**
 * Created by paul on 04/06/15.
 */
public class Movie {

    private Genre genre;
    private Date releaseDate;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(final Genre genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(final Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
