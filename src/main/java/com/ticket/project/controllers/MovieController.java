package com.ticket.project.controllers;

import com.ticket.project.business.domain.MovieScreening;
import com.ticket.project.business.service.ScreeningService;
import com.ticket.project.data.entity.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Set;

@Controller
@RequestMapping("/movies")
public class MovieController {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ScreeningService screeningService;

    @RequestMapping(method = RequestMethod.GET)
    public String getMovies(@RequestParam(value = "date", required = false) String dateString, Model model) {
        java.sql.Date date = null;  // Use java.sql.Date

        if (dateString != null) {
            try {
                // Parse the string date to java.util.Date and convert it to java.sql.Date
                date = new java.sql.Date(DATE_FORMAT.parse(dateString).getTime());
            } catch (ParseException pe) {
                date = new java.sql.Date(System.currentTimeMillis());  // Use current date if parsing fails
            }
        } else {
            date = new java.sql.Date(System.currentTimeMillis()); // Use current date if no string is provided
        }

        // Call the service method with java.sql.Date
        Set<Movie> result = this.screeningService.getMoviesByDate(date);
        model.addAttribute("movies", result);
        model.addAttribute("movieBooking", new MovieScreening());
        return "movies";
    }
}
