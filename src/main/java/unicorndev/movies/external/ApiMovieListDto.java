//package unicorndev.movies.external;
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Getter;
//import lombok.Setter;
//
//public class ApiMovieListDto {
//    private List<ApiMovie> results;
//
//    public List<ApiMovie> getResults() {
//        return results;
//    }
//
//    public void setResults(List<ApiMovie> results) {
//        this.results = results;
//    }
//
//    public static class ApiMovie {
//        @Getter
//        @Setter
//        private Long id;
//
//        @Getter
//        @Setter
//        private String title;
//
//        @Getter
//        @Setter
//        @JsonProperty("poster")
//        private String poster;
//
//        @Getter
//        @Setter
//        @JsonProperty("backdrops")
//        private String backdrops;
//
//        @Getter
//        @Setter
//        @JsonProperty("imdb_id")
//        private Long imdb_id;
//
//        @Getter
//        @Setter
//        private String release_date;
//
//        @Getter
//        @Setter
//        @JsonProperty("trailer_link")
//        private String trailer_link;
//    }
//}
