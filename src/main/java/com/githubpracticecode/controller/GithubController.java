package com.githubpracticecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/githubcode")
public class GithubController {

    //http://localhost:8081/api/githubcode/getUser
    @GetMapping("/getUser")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<>("Fetching user from Mongo", HttpStatus.OK);
    }

    //http://localhost:8081/api/githubcode/getDevelopment
    @GetMapping("/getDevelopment")
    public ResponseEntity<String> getDevelopment() {
        return new ResponseEntity<>("Fetching Development from Mongo", HttpStatus.OK);
    }
    //http://localhost:8081/api/githubcode/getFeature
    @GetMapping("/getFeature")
    public ResponseEntity<String> getFeature() {
        return new ResponseEntity<>("Fetching Feature from Mongo", HttpStatus.OK);
    }

    @GetMapping("/getPull")
    public ResponseEntity<String> getPull() {
        return new ResponseEntity<>("Fetching Pull from Mongo", HttpStatus.OK);
    }

}
