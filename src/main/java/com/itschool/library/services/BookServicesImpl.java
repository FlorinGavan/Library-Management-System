package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.models.dtos.BookDTO;
import com.itschool.library.models.entities.Book;
import com.itschool.library.repositories.BookRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookServicesImpl implements BookServices {

    private final ObjectMapper objectMapper;
    private final BookRepositories bookRepositories;

    public BookServicesImpl(ObjectMapper objectMapper, BookRepositories bookRepositories) {
        this.objectMapper = objectMapper;
        this.bookRepositories = bookRepositories;
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book bookEntity = objectMapper.convertValue(bookDTO, Book.class);
        Book bookEntityResponse = bookRepositories.save(bookEntity);
        log.info("Book with id {} was saved" , bookEntityResponse);
        return objectMapper.convertValue(bookEntityResponse, BookDTO.class);
    }
}