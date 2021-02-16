package com.luxoft.graphql.graph;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.luxoft.graphql.dao.PostDao;
import com.luxoft.graphql.domain.Info;
import com.luxoft.graphql.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostQueryResolver implements GraphQLResolver<Post> {
    private final PostDao postDao;

    public Info info(Post post){

        return postDao.getInfo(post);
    }
}
