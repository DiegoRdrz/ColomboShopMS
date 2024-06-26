package com.ColomboShop.MS_Users.Service;

import com.ColomboShop.MS_Users.Model.Product;
import com.ColomboShop.MS_Users.Model.Review;
import com.ColomboShop.MS_Users.Model.User;
import com.ColomboShop.MS_Users.Repository.ProductRepository;
import com.ColomboShop.MS_Users.Repository.ReviewRepository;
import com.ColomboShop.MS_Users.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(String id) {
        return reviewRepository.findById(id);
    }

    public Review createReview(Review review) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Optional<User> userOptional = userRepository.findByEmail(username);

        if (userOptional.isPresent()) {
            User user = userOptional.get();

            review.setUserID(user.getId());
            Product product = productRepository.findById(review.getProductID())
                    .orElseThrow(() -> new Exception("El producto especificado no existe"));
            review.setProductID(product.getProductID());
            return reviewRepository.save(review);

        } else {
            throw new RuntimeException("User not found");
        }
    }

    public Review updateReview(String id, Review review) {
        if (reviewRepository.existsById(id)) {
            review.setReviewID(id);
            return reviewRepository.save(review);
        } else {
            throw new RuntimeException("Review not found");
        }
    }

    public void deleteReview(String id) {
        reviewRepository.deleteById(id);
    }
}
