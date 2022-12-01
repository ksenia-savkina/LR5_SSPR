package com.example.commentsapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService service;

    @PostMapping
    public Comment save(@RequestBody CommentDto comment) {
        return service.save(comment);
    }

    @GetMapping
    public Iterable<Comment> getAll() {
        return service.getAll();
    }

}