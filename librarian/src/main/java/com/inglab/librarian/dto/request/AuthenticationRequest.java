package com.inglab.librarian.dto.request;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    private String password;

}