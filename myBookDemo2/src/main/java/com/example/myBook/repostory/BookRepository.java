package com.example.myBook.repostory;

import com.example.myBook.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    @Query(value = "select * from books where name like %?1%", nativeQuery = true)
    Optional<BookEntity> findByName(String name);
}
