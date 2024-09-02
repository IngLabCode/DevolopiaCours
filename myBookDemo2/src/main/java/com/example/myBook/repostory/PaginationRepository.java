package com.example.myBook.repostory;

import com.example.myBook.dto.respond.PaginationRespondDTO;
import com.example.myBook.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaginationRepository extends JpaRepository<BookEntity, Long> {
    @Query(value = "select * from books  limit ?1,?2", nativeQuery = true)
    List<BookEntity> findPagination(Integer begin, Integer length);
}
