package com.example.LibraryApp.backend.controller;

import com.example.LibraryApp.backend.dao.Bookdao;
import com.example.LibraryApp.backend.dao.SignupDao;
import com.example.LibraryApp.backend.model.Book;
import com.example.LibraryApp.backend.model.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class LibraryController {

    @Autowired
    private Bookdao dao;

    @Autowired
    private SignupDao d;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/signin",consumes ="application/json",produces ="application/json")
    public List<Signup> login(@RequestBody Signup i){
        String username=String.valueOf(i.getUsername());
        String password=String.valueOf(i.getPassword());
        System.out.println(username);
        System.out.println(password);
        return(List<Signup>)d.signin(i.getUsername(),i.getPassword());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/signup",consumes ="application/json",produces ="application/json")
    public HashMap<String,String> userRegistration(@RequestBody Signup s){
        System.out.println(s.getName());
        System.out.println(s.getAdhaar());
        System.out.println(s.getAddress());
        System.out.println(s.getEmail());
        System.out.println(s.getDob());
        System.out.println(s.getPincode());
        System.out.println(s.getPhoneno());
        System.out.println(s.getUsername());
        System.out.println(s.getPassword());
        System.out.println(s.getConfirmpassword());
        d.save(s);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewsignup")
    public List<Signup> viewsignuppage(){
        return(List<Signup>)d.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addbook",consumes ="application/json",produces ="application/json")
    public HashMap<String,String> addbook(@RequestBody Book b){
        System.out.println(b.getBooktitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getDescription());
        System.out.println(b.getImage());
        dao.save(b);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchbook",consumes = "application/json",produces = "application/json")
    public List<Book> searchbook(@RequestBody Book b){
        String booktitle=String.valueOf(b.getBooktitle());
        System.out.println(booktitle);
        dao.searchBook(b.getBooktitle());
        return(List<Book>)dao.searchBook(b.getBooktitle());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/editbook",consumes = "application/json",produces = "application/json")
    public String BookEdit(){
        return "welcome to edit page";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewbook")
    public List<Book> viewpage(){
        return(List<Book>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/issuebook",consumes = "application/json",produces = "application/json")
    public String Bookissue(){
        return "issue  your books ";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletebook",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> delete(@RequestBody Book d){
        String id=String.valueOf(d.getId());
        System.out.println(id);
        dao.deleteBook(d.getId());
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }


}
