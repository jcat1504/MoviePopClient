//package unicorndev.movies.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Document(collection = "reviews")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Review {
//    @Id
//    private ObjectId id;
//    private String body;
//    private String reviewBody;
//    private String imdbId;
//    private LocalDateTime created;
//    private LocalDateTime updated;
//    private List<String> reviewIds = new ArrayList<>();
//
//    public Review(String body, LocalDateTime created, LocalDateTime updated) {
//        this.body = body;
//        this.created = created;
//        this.updated = updated;
//    }
//
//    public void setReviewBody(String reviewBody) {
//        this.reviewBody = reviewBody;
//    }
//
//    public void setImdbId(String imdbId) {
//        this.imdbId = imdbId;
//    }
//
//    public List<String> getReviewIds() {
//        return reviewIds;
//    }
//}
