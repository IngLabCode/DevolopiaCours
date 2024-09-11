package com.example.librarian.service.impl;

import com.example.librarian.dto.request.BookAddRequestDTO;
import com.example.librarian.entity.BookEntity;
import com.example.librarian.repository.BookRepository;
import com.example.librarian.service.inter.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addBook(BookAddRequestDTO bookAddRequestDTO) {
        BookEntity bookEntity=new BookEntity();
        modelMapper.map(bookAddRequestDTO,bookEntity);
        bookRepository.save(bookEntity);
    }
}
