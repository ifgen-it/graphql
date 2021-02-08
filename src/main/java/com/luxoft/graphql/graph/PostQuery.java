package com.luxoft.graphql.graph;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.luxoft.graphql.dao.PostDao;
import com.luxoft.graphql.domain.Post;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostQuery implements GraphQLQueryResolver {

    private PostDao postDao;

    public PostQuery(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(int count, int offset){

        return postDao.getPosts(count, offset);
    }
}
