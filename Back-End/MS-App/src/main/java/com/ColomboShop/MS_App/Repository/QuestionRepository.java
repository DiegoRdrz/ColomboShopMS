package com.ColomboShop.MS_App.Repository;

import com.BackEnd.Colomboshop.Model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
}
