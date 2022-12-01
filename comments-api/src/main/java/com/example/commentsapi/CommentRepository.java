package com.example.commentsapi;

public interface CommentRepository {
    Comment save(Comment post);

    Iterable<Comment> findAll();
}
