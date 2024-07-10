package com.practice.bookauthors.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/book-authors")
public class JoinBookToAuthorController {

    @PostMapping
    public String joinBooksToAuthors(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
}
