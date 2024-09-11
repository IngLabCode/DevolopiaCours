package com.example.myBook.service.impl;

import com.example.myBook.dto.request.UserAddRequestDTO;
import com.example.myBook.entity.UserEntity;
import com.example.myBook.repostory.UserRepository;
import com.example.myBook.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    @Override
    public void userAdd(UserAddRequestDTO userAddRequestDTO) {
        String password=userAddRequestDTO.getPassword();
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String realPassword="{bcrypt}"+ bCryptPasswordEncoder.encode(password);

        UserEntity userEntity=new UserEntity(userAddRequestDTO.getUsername(),realPassword,1);
        modelMapper.map(userAddRequestDTO,userEntity);
        userRepository.save(userEntity);

    }
}
