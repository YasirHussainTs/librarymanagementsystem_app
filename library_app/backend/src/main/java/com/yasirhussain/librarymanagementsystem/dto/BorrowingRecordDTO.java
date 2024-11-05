package com.yasirhussain.librarymanagementsystem.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BorrowingRecordDTO {
    private Long id;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private BookDTO book;
    private PatronDTO patron;
}
