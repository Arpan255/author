package com.ust.author.repository;

import com.ust.author.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByAuthorName(String authorName);

    Optional<Author> findById1(Long id);
}

