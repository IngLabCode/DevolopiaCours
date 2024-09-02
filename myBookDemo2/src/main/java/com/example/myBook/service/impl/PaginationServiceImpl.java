package com.example.myBook.service.impl;

import com.example.myBook.dto.respond.PaginationRespondDTO;
import com.example.myBook.entity.BookEntity;
import com.example.myBook.repostory.PaginationRepository;
import com.example.myBook.service.PaginationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class PaginationServiceImpl implements PaginationService {
    private final PaginationRepository paginationRepository;
    @Override
    public PaginationRespondDTO findPagination(Integer begin, Integer length) {
        List<BookEntity> bookEntityList=paginationRepository.findPagination(begin,length);
        PaginationRespondDTO paginationRespondDTO=new PaginationRespondDTO();
        paginationRespondDTO.setBookEntityList(bookEntityList);
        return paginationRespondDTO;

    }
}
