package com.example.postsapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Post {

    private int id;

    private String name;

    private String text;

    private LocalDate createdAt;

    private int views;
}
