package com.garage.Service;

import com.garage.Entity.Question;
import com.garage.Entity.Review;
import com.garage.Repository.QuestionDao;
import com.garage.Repository.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *  Created by raz samari on 03.11.2019.
 */
@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {

    private QuestionDao questionDao;

    private ReviewDao reviewDao;
    @Autowired
    public UserServiceImpl(QuestionDao questionDao, ReviewDao reviewDao) {
        this.questionDao = questionDao;
        this.reviewDao = reviewDao;
    }

    @Override
    public Review createReview(Review review) {
        review.setId(0);
        return reviewDao.save(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewDao.findAll();
    }



    @Override
    public Question createQuestion(Question question) {
       question.setId(0);
        return questionDao.save(question);
    }
}
