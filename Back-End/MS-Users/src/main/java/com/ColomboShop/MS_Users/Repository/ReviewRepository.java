package com.ColomboShop.MS_Users.Repository;


import com.ColomboShop.MS_Users.Model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByProductID(String productID);
    List<Review> findByUserID(String userID);
}

