package com.itschool.library.controllers;

import com.itschool.library.models.dtos.CopiesAvailableDTO;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.services.BookServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookControllers {

    private final BookServices bookServices;

    public BookControllers(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @PostMapping
    public ResponseEntity<ResponseBookDTO> createBook(@RequestBody RequestBookDTO requestBookDTO) {
        return ResponseEntity.ok(bookServices.createBook(requestBookDTO));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseBookDTO> updateBookCopies(@PathVariable Long id, @RequestBody CopiesAvailableDTO copiesAvailable) {
        return ResponseEntity.ok(bookServices.updateBookCopies(id, copiesAvailable.getCopiesAvailable()));
    }

    @GetMapping
    public ResponseEntity<List<ResponseBookDTO>> getBooks(
            @RequestParam(value = " title", required = false) String title,
            @RequestParam(value = " author", required = false) String author,
            @RequestParam(value = " genre", required = false) String genre) {
        return ResponseEntity.ok(bookServices.getBooks(title, author, genre));
    }
}