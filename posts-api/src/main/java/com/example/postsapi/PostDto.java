package com.example.postsapi;

import lombok.Data;

@Data
public class PostDto {
    private String name;

    private String text;

    private int views;
}
