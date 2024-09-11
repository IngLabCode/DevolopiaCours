package com.example.myBook.service.impl;

import com.example.myBook.dto.request.UserAddRequestDTO;
import com.example.myBook.entity.UsersEntity;
import com.example.myBook.repostory.UserRepository;
import com.example.myBook.service.UsersService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class UserServiceImpl implements UsersService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public void add(UserAddRequestDTO userAddRequestDTO) {
        String password = userAddRequestDTO.getPassword();
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encodePassword = "{bcrypt}"+bCryptPasswordEncoder.encode(password);
        UsersEntity usersEntity = new UsersEntity(userAddRequestDTO.getName(), encodePassword, 1);
        modelMapper.map(userAddRequestDTO, usersEntity);
        userRepository.save(usersEntity);
    }
}
