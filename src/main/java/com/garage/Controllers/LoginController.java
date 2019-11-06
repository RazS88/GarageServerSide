package com.garage.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garage.Rest.ex.InvalidLoginException;

/**
 *  Created by raz samari on 03.11.2019.
 */
@RestController
@RequestMapping("api")
public class LoginController {
    @PostMapping("/admin")
    ResponseEntity<Boolean> login(@RequestParam String name,@RequestParam String password) throws InvalidLoginException {
        if(name.equals("admin") && password.equals("1234")){
            return ResponseEntity.ok(true);
        }
        throw new InvalidLoginException("name or password invalid");
    }

}
