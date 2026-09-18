package com.harshith.book.repository;
import com.harshith.book.entity.IssueRecord; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface IssueRecordRepository extends JpaRepository<IssueRecord,Long>{
 List<IssueRecord> findByUserId(Long userId); List<IssueRecord> findByBookId(Long bookId);
}