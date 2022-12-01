package com.example.postsapi;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostRepositoryImpl implements PostRepository {

    private final List<Post> list;

    public PostRepositoryImpl() {
        list = new ArrayList<>();
    }

    public Post save(Post post) {
        list.add(post);
        return post;
    }

    public Iterable<Post> findAll() {
        return list;
    }
}