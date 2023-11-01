//package unicorndev.movies.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import unicorndev.movies.model.Review;
//import unicorndev.movies.repository.ReviewRepository;
//
//import java.util.List;
//
//@Service
//public class ReviewService {
//
//    @Autowired
//    private ReviewRepository reviewRepository;
//
//    public Review createReview(String reviewBody, String imdbId) {
//        // Validate input data
//        if (reviewBody == null || imdbId == null || reviewBody.isEmpty() || imdbId.isEmpty()) {
//            throw new IllegalArgumentException("Review body and IMDb ID must be provided.");
//        }
//
//        // Create a new review
//        Review review = new Review();
//        review.setReviewBody(reviewBody);
//        review.setImdbId(imdbId);
//
//        // Save the review to the database
//        return reviewRepository.save(review);
//    }
//
//    public List<Review> getReviewsByMovieId(String imdbId) {
//        // Retrieve reviews for a movie based on its IMDb ID
//        return reviewRepository.findByImdbId(imdbId);
//    }
//
//
//    // Add additional methods for updating and deleting reviews as needed
//    public List<Review> getAllReviews() {
//        // Implement logic to retrieve all reviews from the database
//         return reviewRepository.findAll();
//    }
//}


