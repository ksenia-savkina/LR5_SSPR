package com.example.postsapi;

public interface PostRepository {

    Post save(Post post);

    Iterable<Post> findAll();
}
