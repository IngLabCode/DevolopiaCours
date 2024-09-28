package com.inglab.librarian.dto.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RegisterRequest {

    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;

}