package com.garage.Service;

import com.garage.Entity.Question;
import com.garage.Entity.Review;
import com.garage.Repository.QuestionDao;
import com.garage.Repository.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  Created by raz samari on 03.11.2019.
 */
@Service
public class AdminServiceiml implements AdminService {

	private QuestionDao questionDao;
	private ReviewDao reviewDao;

	@Autowired
	public AdminServiceiml(QuestionDao questionDao, ReviewDao reviewDao) {
		this.questionDao = questionDao;
		this.reviewDao = reviewDao;
	}

	// Question
	@Override
	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	@Override
	public void deleteQuestion(long id) {
		questionDao.deleteById(id);

	}

	@Override
	public void deleteAllQuestions() {
		questionDao.deleteAll();
	}

    //Reviews
	@Override
	public List<Review> getAllReviews() {
		return reviewDao.findAll();
	}

	@Override
	public void deleteReview(long id) {
		reviewDao.deleteById(id);
	}

	@Override
	public void deleteAllReviews() {
		reviewDao.deleteAll();

	}
}
