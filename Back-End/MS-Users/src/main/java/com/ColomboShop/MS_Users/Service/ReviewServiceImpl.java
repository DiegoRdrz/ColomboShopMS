package com.ColomboShop.MS_Users.Service;


import com.ColomboShop.MS_Users.DTO.ReviewDTO;
import com.ColomboShop.MS_Users.Model.Review;
import com.ColomboShop.MS_Users.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review createReview(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setUserID(reviewDTO.getUserID());
        review.setProductID(reviewDTO.getProductID());
        review.setRating(reviewDTO.getRating());
        review.setComment(reviewDTO.getComment());
        review.setDate(reviewDTO.getDate());
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewsByProductID(String productID) {
        return reviewRepository.findByProductID(productID);
    }

    @Override
    public List<Review> getReviewsByUserID(String userID) {
        return reviewRepository.findByUserID(userID);
    }

    @Override
    public void deleteReview(String id) {
        reviewRepository.deleteById(id);
    }
}
