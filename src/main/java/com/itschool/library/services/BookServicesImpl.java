package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.models.dtos.BookDTO;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
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
    public ResponseBookDTO createBook(RequestBookDTO requestBookDTO) {
        Book bookEntity = objectMapper.convertValue(requestBookDTO, Book.class);
        Book bookEntityResponse = bookRepositories.save(bookEntity);
        log.info("Book with id {} was saved" , bookEntityResponse.getId());
        return objectMapper.convertValue(bookEntityResponse, ResponseBookDTO.class);
    }
}