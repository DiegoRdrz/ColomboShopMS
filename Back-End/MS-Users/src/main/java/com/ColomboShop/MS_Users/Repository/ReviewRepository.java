package com.ColomboShop.MS_Users.Repository;

import com.ColomboShop.MS_Users.Model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

    @Override
    Optional<Review> findById(String id);
}
