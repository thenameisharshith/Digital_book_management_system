package com.harshith.book.repository;
import com.harshith.book.entity.Book; import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Long>{}