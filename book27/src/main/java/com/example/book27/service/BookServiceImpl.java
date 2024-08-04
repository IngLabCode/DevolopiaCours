package com.example.book27.service;

import com.example.book27.entity.BookEntity;
import com.example.book27.repository.BookRepo;
import com.example.book27.request.BookAddRequestDTO;
import com.example.book27.respond.BookListResponseDTO;
import com.example.book27.respond.BookResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepo bookRepo;

    @Override
    public void add(BookAddRequestDTO bookAddRequest) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(bookAddRequest.getName());
        bookEntity.setPrice(bookAddRequest.getPrice());
        bookEntity.setAuthor(bookAddRequest.getAuthor());
        bookEntity.setPageCount(bookAddRequest.getPageCount());
        bookRepo.save(bookEntity);
    }

    @Override
    public BookListResponseDTO findAll() {
        return null;
    }

    @Override
    public BookResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
