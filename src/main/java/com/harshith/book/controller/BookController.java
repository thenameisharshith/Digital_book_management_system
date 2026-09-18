package com.harshith.book.controller;
import com.harshith.book.entity.Book; import com.harshith.book.service.BookService; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/books") public class BookController{
 private final BookService service; public BookController(BookService s){service=s;}
 @GetMapping public List<Book> all(){return service.all();}@GetMapping("/{id}") public Book get(@PathVariable Long id){return service.get(id);}
 @PostMapping public Book create(@Valid @RequestBody Book b){return service.create(b);}@PutMapping("/{id}") public Book update(@PathVariable Long id,@Valid @RequestBody Book b){return service.update(id,b);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}