package com.harshith.book.controller;
import com.harshith.book.entity.IssueRecord; import com.harshith.book.service.IssueService; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/issues") public class IssueController{
 private final IssueService service; public IssueController(IssueService s){service=s;}
 @PostMapping("/book/{bookId}/user/{userId}") public IssueRecord issue(@PathVariable Long bookId,@PathVariable Long userId){return service.issue(bookId,userId);}
 @PutMapping("/{id}/return") public IssueRecord returnBook(@PathVariable Long id){return service.returnBook(id);}
 @GetMapping public List<IssueRecord> all(){return service.all();}@GetMapping("/user/{id}") public List<IssueRecord> byUser(@PathVariable Long id){return service.byUser(id);}
 @GetMapping("/book/{id}") public List<IssueRecord> byBook(@PathVariable Long id){return service.byBook(id);}
}