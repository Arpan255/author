package com.ust.author.controller;

import com.ust.author.Model.Author;
import com.ust.author.client.FullResponse;
import com.ust.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class authorcontroller {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/getauthor/{authorName}")
    public ResponseEntity<Author> getauthorByname(@PathVariable("authorName") String authorName) {
        Author author = authorService.getauthorByname(authorName);
        if (author != null) {
            return ResponseEntity.ok(author);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/saveauthor")
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
        Author savedAuthor = authorService.saveAuthor(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAuthor);
    }

    @GetMapping("/withBooks/{id}")
    public ResponseEntity<FullResponse> getauthorbyid(@PathVariable("id") Long id1) {
        return ResponseEntity.ok(authorService.getauthorByid(id1));

    }
}
