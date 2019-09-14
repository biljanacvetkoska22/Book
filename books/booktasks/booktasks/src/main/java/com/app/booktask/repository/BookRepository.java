package com.app.booktask.repository;

import com.app.booktask.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * That is connecting Book model to CRUD operation
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}

