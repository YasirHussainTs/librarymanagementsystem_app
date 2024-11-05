package com.yasirhussain.librarymanagementsystem.repository;

import com.yasirhussain.librarymanagementsystem.entity.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {

    BorrowingRecord findByBookIdAndPatronIdAndReturnDateIsNull(Long bookId, Long patronId);

    // Find all records for a specific book
    List<BorrowingRecord> findByBookId(Long bookId);

    // Find all records for a specific patron
    List<BorrowingRecord> findByPatronId(Long patronId);

    // Find active borrowing records (where return date is null)
    List<BorrowingRecord> findByReturnDateIsNull();
}
