package com.luxoft.graphql.dao;

import com.luxoft.graphql.domain.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostDao {

    private List<Post> posts;
    private int idCounter = 1;

    public PostDao() {
        posts = new ArrayList<>();

        posts.add(new Post(String.valueOf(idCounter++), "Graph QL", "Graph QL Tutorial", "IT", "1"));
        posts.add(new Post(String.valueOf(idCounter++), "Apache Camel", "ESB description", "IT", "1"));
        posts.add(new Post(String.valueOf(idCounter++), "Gazprombank", "Introduction to bank", "Fin", "2"));
        posts.add(new Post(String.valueOf(idCounter++), "SkyEng", "SkyEng lessons", "Eng", "2"));

    }

    public List<Post> getPosts(int count, int offset) {

        return posts.stream().skip(offset).limit(count).collect(Collectors.toList());
    }


    public Post writePost(String title, String text, String category, String authorId) {

        posts.add(new Post(String.valueOf(idCounter++), title, text, category, authorId));
        return posts.get(posts.size() - 1);
    }
}
