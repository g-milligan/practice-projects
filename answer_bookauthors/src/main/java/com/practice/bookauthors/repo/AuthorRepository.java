package com.practice.bookauthors.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.bookauthors.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

