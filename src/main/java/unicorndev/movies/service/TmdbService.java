package unicorndev.movies.service;
import com.fasterxml.jackson.databind.ObjectMapper;
import unicorndev.movies.external.MovieApiResponse;
import org.springframework.stereotype.Service;
import unicorndev.movies.model.Movie;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class TmdbService {
    private final ObjectMapper objectMapper;

    public TmdbService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Movie> getTop10NowPlayingMovies() {
        try {
            MovieApiResponse apiResponse = objectMapper.readValue(getClass().getResourceAsStream("/movies.json"), MovieApiResponse.class);
            if (apiResponse != null && apiResponse.getResults() != null) {
                return apiResponse.getResults().stream()
                        .map(apiMovie -> {
                            Movie movie = new Movie();
                            movie.setId(apiMovie.getId());
                            movie.setTitle(apiMovie.getTitle());
                            movie.setPosterPath(apiMovie.getPosterPath());
                            movie.setBackdropPath(apiMovie.getBackdropPath());
                            movie.setReleaseDate(apiMovie.getReleaseDate());
                            movie.setVoteAverage(apiMovie.getVoteAverage());
                            movie.setOverview(apiMovie.getOverview());
                            return movie;
                        })
                        .collect(Collectors.toList());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}