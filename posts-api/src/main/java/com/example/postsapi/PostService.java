package com.example.postsapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepositoryImpl postRepository;

    public Post save(PostDto postDto) {
        Post post = new Post()
                .setName(postDto.getName())
                .setText(postDto.getText())
                .setViews(postDto.getViews())
                .setId(Integer.parseInt(UUID.randomUUID().toString()))
                .setCreatedAt(LocalDate.now());

        return postRepository.save(post);
    }

    public Iterable<Post> getAll() {
        return postRepository.findAll();
    }

}
