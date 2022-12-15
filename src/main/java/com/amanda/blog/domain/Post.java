package com.amanda.blog.domain;

import com.amanda.blog.dto.AuthorDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document
public class Post implements Serializable {
    @Id
    public String id;
    public Date date;
    private String title;

    private String bory;
    private AuthorDTO author;

    public Post() {
    }

    public Post(String id, Date date, String title, String bory, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.bory = bory;
        this.author = author;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBory() {
        return bory;
    }

    public void setBory(String bory) {
        this.bory = bory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id) && Objects.equals(date, post.date) && Objects.equals(title, post.title) && Objects.equals(bory, post.bory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, title, bory);
    }
}
