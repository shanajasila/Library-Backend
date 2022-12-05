package com.example.LibraryApp.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/addbook")
    public String BookAdd(){
        return "Add your books here";
    }

    @PostMapping("/searchbook")
    public String BookSearch(){
        return "search your books here";
    }

    @PostMapping("/editbook")
    public String BookEdit(){
        return "welcome to edit page";
    }

    @GetMapping("/viewbook")
    public String BookView(){
        return "welcome to view page";
    }

    @PostMapping("/issuebook")
    public String Bookissue(){
        return "issue  your books ";
    }


}
