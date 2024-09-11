package com.example.librarian.service.impl;

import com.example.librarian.controller.BookController;
import com.example.librarian.dto.request.BookAddRequestDTO;
import com.example.librarian.dto.respond.BookFindAllListRespondDTO;
import com.example.librarian.dto.respond.BookFindAllRespondDTO;
import com.example.librarian.entity.BookEntity;
import com.example.librarian.repository.BookRepository;
import com.example.librarian.service.inter.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addBook(BookAddRequestDTO bookAddRequestDTO) {
        BookEntity bookEntity = new BookEntity();
        modelMapper.map(bookAddRequestDTO, bookEntity);
        bookRepository.save(bookEntity);
    }

    @Override
    public BookFindAllListRespondDTO findAll() {
        List<BookEntity> bookEntityList = bookRepository.findAll();
        List<BookFindAllRespondDTO> bookFindAllRespondDTOList = new ArrayList<>();
        for (BookEntity bookEntity : bookEntityList) {
            BookFindAllRespondDTO bookFindAllRespondDTO = modelMapper.map(bookEntity, BookFindAllRespondDTO.class);
            bookFindAllRespondDTOList.add(bookFindAllRespondDTO);
        }
        BookFindAllListRespondDTO bookFindAllListRespondDTO = new BookFindAllListRespondDTO();
        bookFindAllListRespondDTO.setBookFindAllRespondDTOList(bookFindAllRespondDTOList);
        return bookFindAllListRespondDTO;
    }

    @Override
    public void deleteById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("id tapilmadi"));
        bookRepository.deleteById(id);

    }
}

