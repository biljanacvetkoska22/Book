package com.app.booktask.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * That is model will map to database table
 */
@Entity
@Table(name = "book")
public class    Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Size(max = 225)
    private String author;

    @NotNull
    @Size(max = 225)
    private String title;

    @Size(max = 1000)
    private String notes;

    @Basic
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date published;

    public Book() {
        super();
    }

    public Book(@NotNull @Size(max = 225) String author, @NotNull @Size(max = 225) String title, @Size(max = 1000) String notes, @NotNull Date published) {
        this.author = author;
        this.title = title;
        this.notes = notes;
        this.published = published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }
}
