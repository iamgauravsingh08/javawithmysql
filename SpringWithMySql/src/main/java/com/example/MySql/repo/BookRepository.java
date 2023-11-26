package com.example.MySql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MySql.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
