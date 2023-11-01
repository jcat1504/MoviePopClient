package unicorndev.movies.external;
import java.util.*;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class MovieApiResult {
    private String title;
    private long id;
    private String overview;
    private double popularity;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("original_title")
    private String originalTitle;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("vote_average")
    private double voteAverage;

}



