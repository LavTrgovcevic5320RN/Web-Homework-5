package com.example.repository.post;

import com.example.models.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryPostRepository implements PostRepository{
    private static final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    @Override
    public List<Post> all() {
        return new ArrayList<>(posts.values());
    }

    @Override
    public void insert(Post post) {
        Integer id = posts.size();
        post.setPostID(id);
        posts.put(Math.toIntExact(id), post);
    }

    @Override
    public Post getPost(int id) {
        return posts.get(id);
    }
}
