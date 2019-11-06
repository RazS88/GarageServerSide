package com.garage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.Entity.Question;
import com.garage.Entity.Review;
import com.garage.Rest.ex.SystemMalfunctionException;
import com.garage.Service.AdminService;

/**
 *  Created by raz samari on 03.11.2019.
 */
@RestController
@RequestMapping("/api")
public class AdminController  {

    private AdminService adminService;
    
    
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    
    
    // Reviews
    @GetMapping("admin/reviews")
    public ResponseEntity<List<Review>> getAllReviews() throws SystemMalfunctionException{
        List<Review> allReviews = adminService.getAllReviews();
        if(allReviews != null){
            return ResponseEntity.ok(allReviews);

        }
        throw new SystemMalfunctionException("No connection to db");
    }
    
    @DeleteMapping("admin/review/{id}")
    public ResponseEntity<String> removeReview(@PathVariable(name="id") long id) throws SystemMalfunctionException{
    	adminService.deleteReview(id);
    	return ResponseEntity.ok("review with id: " + id + "succefull remove");
    	
    }
    
    @DeleteMapping("admin/reviews")
    public ResponseEntity<String> removeAllReview() throws SystemMalfunctionException{
    	adminService.deleteAllReviews();
    	return ResponseEntity.ok("review remove all succefull");
    	
    }
    
    // Question
    @GetMapping("admin/questions")
    public ResponseEntity<List<Question>> getAllQuestions() throws SystemMalfunctionException {
            List<Question> allQuestions = adminService.getAllQuestions();
        if(allQuestions  != null){
            return ResponseEntity.ok(allQuestions );

        }
        throw new SystemMalfunctionException("No connection to db");

    }
    
    @DeleteMapping("admin/question/{id}")
    public ResponseEntity<String> removeQuestion(@PathVariable(name="id") long id) throws SystemMalfunctionException{
    	adminService.deleteQuestion(id);
    	return ResponseEntity.ok("question with id: " + id + "succefull remove");
    	
    }
    
    @DeleteMapping("admin/questions")
    public ResponseEntity<String> removeAllQuestion() throws SystemMalfunctionException{
    	adminService.deleteAllQuestions();
    	return ResponseEntity.ok("question remove all succefull");
    	
    }
    

    
    
}
