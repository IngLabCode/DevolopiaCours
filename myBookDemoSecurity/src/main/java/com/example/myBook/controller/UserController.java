package com.example.myBook.controller;

import com.example.myBook.dto.request.UserAddRequestDTO;
import com.example.myBook.service.UsersService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequiredArgsConstructor
public class UserController {
    private final UsersService usersService;
    @PostMapping("/add")
    public void add(@RequestBody UserAddRequestDTO userAddRequestDTO){
      usersService.add(userAddRequestDTO);
    }
}
