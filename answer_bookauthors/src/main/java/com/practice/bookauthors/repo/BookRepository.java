package com.practice.bookauthors.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.bookauthors.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

