package com.practice.bookauthors.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BookAuthor {
    @Id
    private Long id;
    private Long authorId;
    private Long bookId;
}
