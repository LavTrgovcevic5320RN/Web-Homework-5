package com.example.repository.post;

import com.example.models.Post;

import java.util.List;

public interface PostRepository {
    public List<Post> all();
    public Post getPost(int postID);
    public void insert(Post post);

}
