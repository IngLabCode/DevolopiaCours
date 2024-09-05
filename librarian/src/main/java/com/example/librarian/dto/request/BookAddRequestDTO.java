package com.example.librarian.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookAddRequestDTO {
    @NotNull(message = "add the name")
    @NotBlank(message = "fill the name gap")
    private String name;
    @NotNull(message = "add the author")
    @NotBlank(message = "fill the author gap")
    private String author;
    @NotNull(message = "add the pageCount")
    private Integer pageCount;
    @NotNull(message = "add the genre")
    @NotBlank(message = "fill the author genre")
    private String genre;
}
