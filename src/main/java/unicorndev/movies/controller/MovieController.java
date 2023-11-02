package unicorndev.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicorndev.movies.model.Movie;
import unicorndev.movies.service.TmdbService;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final TmdbService tmdbService;

    @Autowired
    public MovieController(TmdbService tmdbService) {
        this.tmdbService = tmdbService;
    }

    @GetMapping("/now-playing")
    public ResponseEntity<List<Movie>> getNowPlayingMovies() {
        List<Movie> nowPlayingMovies = tmdbService.getTop10NowPlayingMovies();
        return new ResponseEntity<>(nowPlayingMovies, HttpStatus.OK);
    }
}



