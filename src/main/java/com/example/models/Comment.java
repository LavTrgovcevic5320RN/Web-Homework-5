package com.example.models;

public class Comment {
    private int postID;
    private String name;
    private String body;

    public Comment(int postID, String name, String body) {
        this.postID = postID;
        this.name = name;
        this.body = body;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
