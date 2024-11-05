package com.yasirhussain.librarymanagementsystem.service;

import com.yasirhussain.librarymanagementsystem.dto.BookDTO;
import com.yasirhussain.librarymanagementsystem.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    // Retrieve a list of all books
    List<BookDTO> getAllBooks();

    // Retrieve details of a specific book by ID
    Optional<BookDTO> getBookById(Long id);

    // Add a new book to the library
    BookDTO addBook(BookDTO bookDTO);

    // Update an existing book's information
    BookDTO updateBook(Long id, BookDTO bookDTO);

    // Remove a book from the library
    void deleteBook(Long id);
}
