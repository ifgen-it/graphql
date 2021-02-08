package com.luxoft.graphql.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Post implements Serializable {

    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;

}
