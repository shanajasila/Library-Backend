package com.example.LibraryApp.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @PostMapping("/sighnin")
    public String sighin(){
        return "welcome to sign in page";
    }

    @PostMapping("/sighnup")
    public String sighup(){
        return "welcome to sign up page";
    }
}
