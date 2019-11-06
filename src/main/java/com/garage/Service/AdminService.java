package com.garage.Service;

import com.garage.Entity.Question;
import com.garage.Entity.Review;

import java.util.List;

/**
 *  Created by raz samari on 03.11.2019.
 */
public interface AdminService {
	
    // Question Crud
    List<Question> getAllQuestions();
    
    void deleteQuestion(long id);
    
    void deleteAllQuestions();
    // Reviews Crud
    List<Review> getAllReviews();
    
    void deleteReview(long id);
    
    void deleteAllReviews();

}
