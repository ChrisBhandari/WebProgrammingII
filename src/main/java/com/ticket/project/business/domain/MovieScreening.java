package com.ticket.project.business.domain;

import java.util.Date;

public class MovieScreening {
    private String movieName;
    private String moviePosterURL;
    private long TheaterId;
    private String TheaterName;
    private String TheaterCity;
    private String screeningDate;
    private String screeningTime;
    private int numSeats;

    public String getMoviePosterURL() {
        return moviePosterURL;
    }

    public void setMoviePosterURL(String moviePosterURL) {
        this.moviePosterURL = moviePosterURL;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(String screeningDate) {
        this.screeningDate = screeningDate;
    }

    public String getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(String screeningTime) {
        this.screeningTime = screeningTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public long getTheaterId() {
        return TheaterId;
    }

    public void setTheaterId(long TheaterId) {
        this.TheaterId = TheaterId;
    }

    public String getTheaterName() {
        return TheaterName;
    }

    public void setTheaterName(String TheaterName) {
        this.TheaterName = TheaterName;
    }

    public String getTheaterCity() {
        return TheaterCity;
    }

    public void setTheaterCity(String TheaterCity) {
        this.TheaterCity = TheaterCity;
    }
}
