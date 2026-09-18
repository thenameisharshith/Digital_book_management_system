package com.harshith.book.repository;
import com.harshith.book.entity.User; import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long>{}