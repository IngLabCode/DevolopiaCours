package com.example.myBook.service.impl;

import com.example.myBook.dto.request.BookAddRequestDTO;
import com.example.myBook.dto.request.BookUpdateByIdRequestDTO;
import com.example.myBook.dto.respond.BookFindAllRequestDTO;
import com.example.myBook.dto.respond.BookFindByIdRespondDTO;
import com.example.myBook.dto.respond.BookFindByNameRespondDTO;
import com.example.myBook.dto.respond.BookListFindAllRequestDTO;
import com.example.myBook.entity.BookEntity;
import com.example.myBook.exception.OurException;
import com.example.myBook.repostory.BookRepository;
import com.example.myBook.service.BookService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;


    @Override
    public void add(BookAddRequestDTO bookAddRequestDTO) {
        BookEntity bookEntity = new BookEntity();
        modelMapper.map(bookAddRequestDTO, bookEntity);
        bookRepository.save(bookEntity);
    }

    @Override
    public void update(BookUpdateByIdRequestDTO bookUpdateByIdRequestDTO) {
        Long id = bookUpdateByIdRequestDTO.getId();
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new OurException("melumat tapilmadi", "information not found"));
        modelMapper.map(bookUpdateByIdRequestDTO, bookEntity);
        bookRepository.save(bookEntity);
    }

    @Override
    public BookListFindAllRequestDTO findAll() {
        List<BookEntity> bookEntityList = bookRepository.findAll();
        List<BookFindAllRequestDTO> bookFindAllRequestDTOS = new ArrayList<>();
        for (BookEntity bookEntity : bookEntityList) {
            BookFindAllRequestDTO bookFindAllRequestDTO = modelMapper.map(bookEntity, BookFindAllRequestDTO.class);
            bookFindAllRequestDTOS.add(bookFindAllRequestDTO);
        }
        BookListFindAllRequestDTO bookListFindAllRequestDTO = new BookListFindAllRequestDTO();
        bookListFindAllRequestDTO.setBookFindAllRequestDTOS(bookFindAllRequestDTOS);
        return bookListFindAllRequestDTO;
    }

    @Override
    public void deleteById(Long id) {
        Optional<BookEntity> bookEntity = bookRepository.findById(id);
        if (bookEntity.isPresent()) {
            bookRepository.deleteById(id);
        } else {
            throw new OurException("id tapilamdi", "id not found");
        }
    }

    @Override
    public BookFindByIdRespondDTO findById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new OurException("id tapilmadi", "id not found"));
        BookFindByIdRespondDTO bookFindByIdRespondDTO = new BookFindByIdRespondDTO();
        modelMapper.map(bookEntity, bookFindByIdRespondDTO);
        return bookFindByIdRespondDTO;
    }

    @Override
    public BookFindByNameRespondDTO findByName(String name) {
        Optional<BookEntity> bookEntityOptional = bookRepository.findByName(name);
        if (bookEntityOptional.isPresent()) {
            BookFindByNameRespondDTO bookFindByNameRespondDTO = new BookFindByNameRespondDTO();
            modelMapper.map(bookEntityOptional.get(), bookFindByNameRespondDTO);
            return bookFindByNameRespondDTO;
        } else {
            throw new OurException("name tapilmadi", "name not found");
        }


    }


    }






