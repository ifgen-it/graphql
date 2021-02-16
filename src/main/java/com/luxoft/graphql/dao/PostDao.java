package com.luxoft.graphql.dao;

import com.luxoft.graphql.domain.Info;
import com.luxoft.graphql.domain.Post;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PostDao {

    private Map<Integer, Post> posts;
    private Map<Integer, Info> infos;
    private int idCounter = 1;

    public PostDao() {
        posts = new HashMap<>();
        infos = new HashMap<>();

        posts.put(idCounter, new Post(String.valueOf(idCounter), "Graph QL", "IT", "1", null));
        infos.put(idCounter++, new Info("Graph QL Tutorial"));
        posts.put(idCounter, new Post(String.valueOf(idCounter), "Apache Camel", "IT", "1", null));
        infos.put(idCounter++, new Info("ESB description"));
        posts.put(idCounter, new Post(String.valueOf(idCounter), "Gazprombank", "Fin", "2", null));
        infos.put(idCounter++, new Info("Introduction to bank"));
        posts.put(idCounter, new Post(String.valueOf(idCounter), "SkyEng", "Eng", "2", null));
        infos.put(idCounter++, new Info("SkyEng lessons"));

    }

    public List<Post> getPosts(int count, int offset) {

        return posts.values().stream().sorted(Comparator.comparing(post -> Integer.parseInt(post.getId())))
                .skip(offset).limit(count).collect(Collectors.toList());
    }


    public Post writePost(String title, String category, String authorId, String info) {

        Post post = new Post(String.valueOf(idCounter), title, category, authorId, null);
        posts.put(idCounter, post);
        infos.put(idCounter++, new Info(info));

        return post;
    }

    public Info getInfo(Post post) {

        Info info = infos.get(Integer.parseInt(post.getId()));
        return info;
    }
}
