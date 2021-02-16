package com.luxoft.graphql.domain;

import lombok.Value;

@Value
public class Post {

    String id;
    String title;
    String category;
    String authorId;
    Info info;

}
