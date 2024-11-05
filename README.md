The Library Management System is a web application built with Spring Boot that allows librarians to manage books, patrons, and borrowing records.

## Table of Contents

1. [Features](#features)
2. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
   - [Running the Application](#running-the-application)
3. [API Documentation](#api-documentation)
   - [Authentication](#authentication)
   - [Books](#books)
     - [Get All Books](#get-all-books)
     - [Get Book by ID](#get-book-by-id)
     - [Create Book](#create-book)
     - [Update Book](#update-book)
     - [Delete Book](#delete-book)
   - [Patrons](#patrons)
     - [Get All Patrons](#get-all-patrons)
     - [Get Patron by ID](#get-patron-by-id)
     - [Create Patron](#create-patron)
     - [Update Patron](#update-patron)
     - [Delete Patron](#delete-patron)
   - [Borrowing](#borrowing)
     - [Borrow a Book](#borrow-a-book)
     - [Return a Book](#return-a-book)
4. [Error Handling](#error-handling)
5. [Testing](#testing)
6. [Contributing](#contributing)
7. [License](#license)

## Features

- Manage books (create, update, delete, and retrieve)
- Manage patrons (create, update, delete, and retrieve)
- Track book borrowing and returns
- Validate user input and handle errors gracefully
- Provide comprehensive API documentation

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.8.x or later

### Installation

1. Clone the repository:

   ```bash
        https://github.com/YasirHussainTs/librarymanagementsystem_app.git

### Navigate to the project directory

2.  cd library-management-system

### Build the project using Maven

3.  mvn clean install

### Start the application

4.  mvn spring-boot:run

5.  The application will be accessible at http://localhost:8080.

### Get All Books
   
    Endpoint: GET /api/books
    Response: A list of all books in the library. 

### Get Book by ID
    
    Endpoint: GET /api/books/{id}
    Response: Details of a specific book.

### Create Book
    
    Endpoint: POST /api/books
    Request Body: The book information to be created.
    Response: The created book.

### Update Book
 
    Endpoint: PUT /api/books/{id}
    Request Body: The updated book information.
    Response: The updated book.

### Delete Book

    Endpoint: DELETE /api/books/{id}
    Response: No content.

### Patrons
    
    Similar to the "Books" section, but for patron-related operations.

### Borrowing

    Endpoint: POST /api/borrow/{bookId}/patron/{patronId}
    Response: The borrowing record.

### Return a Book
    
    Endpoint: PUT /api/return/{bookId}/patron/{patronId}
    Response: The borrowing record with the return date.

### Error Handling
    The application provides a global exception handler that returns structured error responses. Clients can handle different types of errors based on the information provided in the error responses.

### Testing
    The project includes comprehensive unit and integration tests. You can run the tests using the following command:

1.  mvn test


### Contributing

    Contributions are welcome! Please follow these guidelines:

Fork the repository.
Create a new branch for your feature or bug fix.
Make your changes and commit them with clear commit messages.
Push your changes to your fork.
Submit a pull request to the main repository.
