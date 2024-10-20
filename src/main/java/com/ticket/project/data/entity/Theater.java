package com.ticket.project.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "THEATER")
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theaterId;


    @Column(name = "THEATER_NAME")
    private String theaterName;

    @Column(name = "THEATER_CITY")
    private String theaterCity;

    // Getters and Setters
    public Long getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Long theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterCity() {
        return theaterCity;
    }

    public void setTheaterCity(String theaterCity) {
        this.theaterCity = theaterCity;
    }
}
