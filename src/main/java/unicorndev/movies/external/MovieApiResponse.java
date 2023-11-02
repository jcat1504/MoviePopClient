package unicorndev.movies.external;

import java.util.List;

public class MovieApiResponse {
    private List<MovieApiResult> results;
    public List<MovieApiResult> getResults() {
        return results;
    }
    public void setResults(List<MovieApiResult> results) {
        this.results = results;
    }
}
