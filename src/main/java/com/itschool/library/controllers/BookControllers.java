package com.itschool.library.controllers;

import com.itschool.library.models.dtos.BookDTO;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.services.BookServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControllers {

    private  final BookServices bookServices;

    public BookControllers(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @PostMapping("/api/books")
    public ResponseEntity<ResponseBookDTO> createBook(@RequestBody RequestBookDTO requestBookDTO){
        return ResponseEntity.ok(bookServices.createBook(requestBookDTO));
    }
}