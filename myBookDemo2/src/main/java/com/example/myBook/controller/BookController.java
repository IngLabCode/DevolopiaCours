package com.example.myBook.controller;

import com.example.myBook.dto.request.BookAddRequestDTO;
import com.example.myBook.dto.request.BookUpdateByIdRequestDTO;
import com.example.myBook.dto.respond.BookFindByIdRespondDTO;
import com.example.myBook.dto.respond.BookFindByNameRespondDTO;
import com.example.myBook.dto.respond.BookListFindAllRequestDTO;
import com.example.myBook.error.BookErrorRespond;
import com.example.myBook.exception.OurException;
import com.example.myBook.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void add(@Valid @RequestBody BookAddRequestDTO bookAddRequestDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new OurException("melumatin tamligi pozulub", "data is ot enough");
        }
        bookService.add(bookAddRequestDTO);
    }

    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.ACCEPTED)

    public void update(@RequestBody BookUpdateByIdRequestDTO bookUpdateByIdRequestDTO) {
        bookService.update(bookUpdateByIdRequestDTO);
    }

    @GetMapping("/findAll")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public BookListFindAllRequestDTO findAll() {
        return bookService.findAll();
    }

    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteById(id);

    }

    @GetMapping("/findById/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public BookFindByIdRespondDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @GetMapping("/findByName")
    public BookFindByNameRespondDTO findByName(@RequestParam(name = "name", required = false, defaultValue = "melumat gonderlimeyib") String name) {
        return bookService.findByName(name);
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    private BookErrorRespond bookErrorRespond(OurException ourException) {
        BookErrorRespond bookErrorRespond = new BookErrorRespond();
        bookErrorRespond.setMessage(ourException.getMessage());
        bookErrorRespond.setInternalMessage(ourException.getInternalMessage());
        HttpStatus status = HttpStatus.BAD_GATEWAY;
        bookErrorRespond.setStatus(status);
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        bookErrorRespond.setTimeStamp(timeStamp);
        return bookErrorRespond;
    }
}
