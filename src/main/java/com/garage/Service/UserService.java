package com.garage.Service;

import com.garage.Entity.Question;
import com.garage.Entity.Review;

import java.util.List;

/**
 *  Created by raz samari on 03.11.2019.
 */
public interface UserService {
	
	//Review Crud
    Review createReview(Review review);
    
    List<Review> getAllReviews();
   
    // Question Crud
    Question createQuestion(Question question);
}
