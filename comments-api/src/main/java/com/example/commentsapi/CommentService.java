package com.example.commentsapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment save(CommentDto commentDto) {
        Comment comment = new Comment()
                .setContent(commentDto.getContent())
                .setId(Integer.parseInt(UUID.randomUUID().toString()))
                .setCreatedat(LocalDate.now());

        return commentRepository.save(comment);
    }

    public Iterable<Comment> getAll() {
        return commentRepository.findAll();
    }

}
