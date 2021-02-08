package com.luxoft.graphql.graph;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.luxoft.graphql.dao.PostDao;
import com.luxoft.graphql.domain.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMutation implements GraphQLMutationResolver {

    private PostDao postDao;

    public PostMutation(PostDao postDao) {
        this.postDao = postDao;
    }

    public Post writePost(String title, String text, String category, String authorId){

        return postDao.writePost(title, text, category, authorId);
    }
}
