package com.example.models;

import java.util.Date;

public class Post {
    private String author;
    private int postID;
    private String title;
    private String content;
    private Date createdDate;

    public Post(String author, int postID, String title, String content, Date createdDate) {
        this.author = author;
        this.postID = postID;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
