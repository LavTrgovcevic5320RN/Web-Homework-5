package com.example.repository.comment;

import com.example.models.Comment;

import java.util.List;

public interface CommentRepository {
    public List<Comment> allId(int id);
    public Comment insert(Comment comment);
}
