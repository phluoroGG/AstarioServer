package com.tp31.astarioserver.model.post;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class PostDao {

    @Autowired
    private PostRepository repository;

    public Post save(Post post) {
        return repository.save(post);
    }

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(posts::add);
        return posts;
    }

    public void delete(int postId) {
        repository.deleteById(postId);
    }
}
