package com.githubpracticecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/githubcode")
public class GithubController {

    //http://localhost:8080/api/githubcode/getUser
    @GetMapping("/getUser")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<>("Fetching user", HttpStatus.OK);
    }

}
