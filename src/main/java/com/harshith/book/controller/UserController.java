package com.harshith.book.controller;
import com.harshith.book.entity.User; import com.harshith.book.service.UserService; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/users") public class UserController{
 private final UserService service; public UserController(UserService s){service=s;}
 @GetMapping public List<User> all(){return service.all();}@GetMapping("/{id}") public User get(@PathVariable Long id){return service.get(id);}
 @PostMapping public User create(@Valid @RequestBody User u){return service.create(u);}@PutMapping("/{id}") public User update(@PathVariable Long id,@Valid @RequestBody User u){return service.update(id,u);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}