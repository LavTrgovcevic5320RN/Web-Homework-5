package com.example.services;

import com.example.models.Post;
import com.example.repository.post.PostRepository;

import javax.inject.Inject;
import java.util.List;

public class PostService {

    public PostService() {
        System.out.println(this);
    }

    @Inject
    private PostRepository postRepository;

    public void addPost(Post post) {
        this.postRepository.insert(post);
    }

    public List<Post> allPosts() {
        return this.postRepository.all();
    }

    public Post findPost(Integer id) {
        return this.postRepository.getPost(id);
    }

}
