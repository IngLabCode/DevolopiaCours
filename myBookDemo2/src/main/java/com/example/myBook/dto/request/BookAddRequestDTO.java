package com.example.myBook.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookAddRequestDTO {
    @NotNull(message = "mesaji daxil edin")
    @NotBlank(message = "xanani box buraxmaq olmaz")
    private String name;
    @NotNull(message = "mesaji daxil edin")
    private Double price;
    @NotNull(message = "mesaji daxil edin")
    private Integer pageCount;
    @NotNull(message = "mesaji daxil edin")
    @NotBlank(message = "xanani box buraxmaq olmaz")
    private String author;
}
