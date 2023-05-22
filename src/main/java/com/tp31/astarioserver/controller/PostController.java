package com.tp31.astarioserver.controller;

import com.tp31.astarioserver.model.post.Post;
import com.tp31.astarioserver.model.post.PostDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostDao postDao;

    @GetMapping("/post/get-all")
    public List<Post> getAllEmployees() {
        return postDao.getAllPosts();
    }

    @PostMapping("/post/save")
    public Post save(@RequestBody Post post) {
        return postDao.save(post);
    }
}
