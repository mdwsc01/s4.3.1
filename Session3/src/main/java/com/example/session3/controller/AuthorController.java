package com.example.session3.controller;

import com.example.session3.model.Author;
import com.example.session3.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthor();
    }
}
