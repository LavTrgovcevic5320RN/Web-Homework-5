package com.example.services;

import com.example.models.Comment;
import com.example.repository.comment.CommentRepository;

import javax.inject.Inject;
import java.util.List;

public class CommentService {

    public CommentService() {
        System.out.println(this);
    }

    @Inject
    private CommentRepository commentRepository;

    public Comment addComment(Comment comment) {
        return this.commentRepository.insert(comment);
    }

    public List<Comment> allComments(Integer id) {
        return this.commentRepository.allId(id);
    }

}
