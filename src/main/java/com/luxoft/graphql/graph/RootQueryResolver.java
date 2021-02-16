package com.luxoft.graphql.graph;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.luxoft.graphql.dao.PostDao;
import com.luxoft.graphql.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @see PostQueryResolver  - child
 */

@Component
@RequiredArgsConstructor
public class RootQueryResolver implements GraphQLQueryResolver {
    private final PostDao postDao;

    public List<Post> posts(int count, int offset){

        return postDao.getPosts(count, offset);
    }
}
