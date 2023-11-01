//package unicorndev.movies.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import unicorndev.movies.model.Review;
//import unicorndev.movies.service.ReviewService;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
////@CrossOrigin(origins = "https://movie-gold-v1.onrender.com", allowedHeaders = "*")
////@CrossOrigin(origins = {"https://movie-gold-v1.onrender.com"})
//@CrossOrigin(origins = {"*"})
//@RequestMapping("/api/v1/reviews")
//public class ReviewController {
//    @Autowired
//    private ReviewService service;
//
//    @GetMapping
//    public ResponseEntity<List<Review>> getAllReviews() {
//        List<Review> reviews = service.getAllReviews();
//        return new ResponseEntity<>(reviews, HttpStatus.OK);
//    }
//
//    @PostMapping()
//    public ResponseEntity<?> createReview(@RequestBody Map<String, String> payload) {
//        String reviewBody = payload.get("reviewBody");
//        String imdbId = payload.get("imdbId");
//
//        if (reviewBody == null || imdbId == null) {
//            return new ResponseEntity<>("Both 'reviewBody' and 'imdbId' must be provided in the request body.", HttpStatus.BAD_REQUEST);
//        }
//
//        try {
//            Review createdReview = service.createReview(reviewBody, imdbId);
//            return new ResponseEntity<>(createdReview, HttpStatus.OK);
//        } catch (Exception e) {
//            // Handle any exceptions (e.g., database errors)
//            return new ResponseEntity<>("An error occurred while creating the review.", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//}