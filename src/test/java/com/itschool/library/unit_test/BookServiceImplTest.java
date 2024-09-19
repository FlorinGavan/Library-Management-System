package com.itschool.library.unit_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.models.dtos.BookDTO;
import com.itschool.library.models.entities.Book;
import com.itschool.library.repositories.BookRepositories;
import com.itschool.library.services.BookServicesImpl;
import org.apache.coyote.Request;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceImplTest {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private BookRepositories bookRepositories;

    @InjectMocks
    private BookServicesImpl bookServices;


    @Test
    void testCreateBook() {
        //given
        BookDTO requestBookDTO = new BookDTO();
        requestBookDTO.setTitle("Test Title");
        requestBookDTO.setAuthor("Test Author");
        requestBookDTO.setIsbn("Test ISBN");
        requestBookDTO.setGenre("Test Genre");

        BookDTO responseBookDTO = new BookDTO();
        responseBookDTO.setId(1L);
        responseBookDTO.setTitle("Test Title");
        responseBookDTO.setAuthor("Test Author");
        responseBookDTO.setIsbn("Test ISBN");
        responseBookDTO.setGenre("Test Genre");
        Book bookEntity = new Book();
        bookEntity.setId(1L);
        bookEntity.setTitle("Test Title");
        bookEntity.setAuthor("Test Author");
        bookEntity.setIsbn("Test ISBN");
        bookEntity.setGenre("Test Genre");

        Book savedBookEntity = new Book();
        savedBookEntity.setId(1L);
        savedBookEntity.setTitle("Test Title");
        savedBookEntity.setAuthor("Test Author");
        savedBookEntity.setIsbn("Test ISBN");
        savedBookEntity.setGenre("Test Genre");

        when(objectMapper.convertValue(requestBookDTO, Book.class)).thenReturn(bookEntity);
        when(bookRepositories.save(bookEntity)).thenReturn(bookEntity);
        when(objectMapper.convertValue(savedBookEntity, BookDTO.class)).thenReturn(responseBookDTO);

        //when
        BookDTO savedBookDTO = bookServices.createBook(requestBookDTO);

        //then
        assertEquals(requestBookDTO.getAuthor(), savedBookDTO.getAuthor());
    }
}