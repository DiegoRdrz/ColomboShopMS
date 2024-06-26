package com.ColomboShop.MS_Users.Service;

import com.ColomboShop.MS_Users.DTO.ReviewDTO;
import com.ColomboShop.MS_Users.Model.Review;

import java.util.List;

public interface ReviewService {
    Review createReview(ReviewDTO reviewDTO);
    List<Review> getReviewsByProductID(String productID);
    List<Review> getReviewsByUserID(String userID);
    void deleteReview(String id);
}
