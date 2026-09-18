package com.harshith.book.entity;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity @Table(name="issue_records")
public class IssueRecord {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Book book; @ManyToOne(optional=false) private User user;
 private LocalDate issueDate; private LocalDate returnDate; private boolean returned;
 public IssueRecord(){}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public Book getBook(){return book;} public void setBook(Book v){book=v;}
 public User getUser(){return user;} public void setUser(User v){user=v;}
 public LocalDate getIssueDate(){return issueDate;} public void setIssueDate(LocalDate v){issueDate=v;}
 public LocalDate getReturnDate(){return returnDate;} public void setReturnDate(LocalDate v){returnDate=v;}
 public boolean isReturned(){return returned;} public void setReturned(boolean v){returned=v;}
}