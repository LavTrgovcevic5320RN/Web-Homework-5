package com.example.repository.comment;

import com.example.models.Comment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryCommentRepository implements CommentRepository{
    private static final List<Comment> comments = new CopyOnWriteArrayList<>();

    @Override
    public List<Comment> allId(int id) {
        List<Comment> commentList = new ArrayList<>();
        comments.iterator().forEachRemaining(e -> {
            if(e.getPostID() == id){
                commentList.add(e);
            }
        });

        return commentList;
    }

    @Override
    public Comment insert(Comment comment) {
        comments.add(comment);
        return comment;
    }
}
