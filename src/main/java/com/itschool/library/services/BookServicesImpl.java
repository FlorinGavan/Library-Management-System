package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.exceptions.BookNotFoundExceptions;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.models.entities.Book;
import com.itschool.library.repositories.BookRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

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
        log.info("Book with id {} was saved", bookEntityResponse.getId());
        return objectMapper.convertValue(bookEntityResponse, ResponseBookDTO.class);
    }

    @Override
    public ResponseBookDTO updateBookCopies(Long bookId, int newCopiesAvailable) {
        Book book = bookRepositories.findById(bookId).orElseThrow(() -> new BookNotFoundExceptions(" Book with id " + bookId + " not Found"));

        book.setCopiesAvailable(newCopiesAvailable);
        Book updatedBook = bookRepositories.save(book);
        log.info("Updated book copies  for book id {}", updatedBook.getId());

        return objectMapper.convertValue(updatedBook, ResponseBookDTO.class);
    }

    @Override
    public List<ResponseBookDTO> getBooks(String title, String author, String genre) {
        Specification<Book> specification = Specification
                .where(BookSpecification.titleContains(title))
                .and(BookSpecification.authorContains(author))
                .and(BookSpecification.genreContains(genre));

        List<Book> books = bookRepositories.findAll(specification);
        log.info("{} books found", books.size());

        return books.stream()
                .map(book -> objectMapper.convertValue(book, ResponseBookDTO.class))
                .toList();
    }
}