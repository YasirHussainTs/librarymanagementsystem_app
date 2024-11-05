package com.yasirhussain.librarymanagementsystem.service;

import com.yasirhussain.librarymanagementsystem.dto.PatronDTO;

import java.util.List;

public interface PatronService {
    List<PatronDTO> getAllPatrons();
    PatronDTO getPatronById(Long id);
    PatronDTO addPatron(PatronDTO patronDTO);
    PatronDTO updatePatron(Long id, PatronDTO patronDTO);
    void deletePatron(Long id);
}
