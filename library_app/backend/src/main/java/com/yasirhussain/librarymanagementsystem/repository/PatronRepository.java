package com.yasirhussain.librarymanagementsystem.repository;

import com.yasirhussain.librarymanagementsystem.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatronRepository extends JpaRepository<Patron, Long> {

    // Find patrons by name
    List<Patron> findByName(String name);

    // Find patrons by contact info
    Patron findByContactInfo(String contactInfo);
}
