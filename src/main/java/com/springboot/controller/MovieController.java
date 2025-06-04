package com.springboot.controller;

import com.springboot.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    // Simulated movie data
//    private static final Map<String, List<String>> moviesByLanguage = new HashMap<>();

    private static final Map<String, List<Movie>> moviesByLanguage = new HashMap<>();

    static {
        moviesByLanguage.put("English", Arrays.asList(
                new Movie("Inception", "/assets/images/inception.png"),
                new Movie("The Dark Knight", "/assets/images/thedarkknight.jpg"),
                new Movie("Interste     llar", "/assets/images/interstellar.jpg"),
                new Movie("Avatar", "/assets/images/avatar.jpg")
        ));
        // Add more languages and movie details
    }

    @GetMapping("/{language}")
    public List<Movie> getMoviesByLanguage(@PathVariable String language) {
        return moviesByLanguage.getOrDefault(language, Collections.emptyList());
    }

//    // Endpoint to fetch movies by language
//    @GetMapping("/{language}")
//    public List<String> getMoviesByLanguage(@PathVariable String language) {
//        return moviesByLanguage.getOrDefault(language, Collections.emptyList());
//    }
}
