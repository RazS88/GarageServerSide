package com.garage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.Entity.Question;
import com.garage.Entity.Review;
import com.garage.Rest.ex.SystemMalfunctionException;
import com.garage.Service.UserService;

/**
 *  Created by raz samari on 03.11.2019.
 */
@RestController
@RequestMapping("api")
public class UserController {

    private UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews() throws SystemMalfunctionException {
        List<Review> allReviews = userService.getAllReviews();
        if(allReviews != null){
            return ResponseEntity.ok(allReviews);

        }
        throw new SystemMalfunctionException("No connection to db");

    }
    

    @PostMapping("/review")
    public ResponseEntity<Review>addReview(@RequestBody Review review) throws SystemMalfunctionException{
        Review review1 = userService.createReview(review);
        if(review1!= null){
            return ResponseEntity.ok(review1);
        }
        throw  new SystemMalfunctionException("No connection");
    }

    @PostMapping("/question")
    public ResponseEntity<Question>addQuestion(@RequestBody  Question question) throws SystemMalfunctionException {
        Question question1 = userService.createQuestion(question);
        if(question1!= null){
            return ResponseEntity.ok(question1);
        }
        throw  new SystemMalfunctionException("No connection");
    }
    

    

}
