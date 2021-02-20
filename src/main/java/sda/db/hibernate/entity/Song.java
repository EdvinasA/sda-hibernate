package sda.db.hibernate.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue()
    private UUID id;

    private String name;

    @OneToOne
    private Author author;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}