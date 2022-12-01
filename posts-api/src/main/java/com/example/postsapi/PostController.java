package com.example.postsapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    @PostMapping
    public Post save(@RequestBody PostDto post) {
        return service.save(post);
    }

    @GetMapping
    public Iterable<Post> getAll() {
        return service.getAll();
    }
}
