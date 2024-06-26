package com.ColomboShop.MS_Users.Controller;

import com.ColomboShop.MS_Users.DTO.ReviewDTO;
import com.ColomboShop.MS_Users.Model.Review;
import com.ColomboShop.MS_Users.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colomboShop/user/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody ReviewDTO reviewDTO) {
        return ResponseEntity.ok(reviewService.createReview(reviewDTO));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Review>> getReviewsByProductID(@PathVariable String productId) {
        return ResponseEntity.ok(reviewService.getReviewsByProductID(productId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Review>> getReviewsByUserID(@PathVariable String userId) {
        return ResponseEntity.ok(reviewService.getReviewsByUserID(userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable String id) {
        reviewService.deleteReview(id);
        return ResponseEntity.noContent().build();
    }
}

