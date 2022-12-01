package com.example.commentsapi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommentRepositoryImpl implements CommentRepository {

    private final List<Comment> list;

    public CommentRepositoryImpl() {
        list = new ArrayList<>();
    }

    public Comment save(Comment comment) {
        list.add(comment);
        return comment;
    }

    public Iterable<Comment> findAll() {
        return list;
    }
}
