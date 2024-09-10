package com.itschool.library.services;

import com.itschool.library.models.dtos.BookDTO;

public interface BookServices {
    BookDTO createBook(BookDTO bookDTO);

}