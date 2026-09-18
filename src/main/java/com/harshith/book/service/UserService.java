package com.harshith.book.service;
import com.harshith.book.entity.User; import com.harshith.book.exception.ResourceNotFoundException; import com.harshith.book.repository.UserRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class UserService{
 private final UserRepository repo; public UserService(UserRepository repo){this.repo=repo;}
 public List<User> all(){return repo.findAll();} public User get(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found: "+id));}
 public User create(User u){return repo.save(u);} public User update(Long id,User u){User x=get(id);x.setName(u.getName());x.setEmail(u.getEmail());x.setPhone(u.getPhone());return repo.save(x);}
 public void delete(Long id){repo.delete(get(id));}
}