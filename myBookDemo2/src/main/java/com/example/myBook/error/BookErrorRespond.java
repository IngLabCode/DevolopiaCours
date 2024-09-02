package com.example.myBook.error;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class BookErrorRespond {
    private String message;
    private String internalMessage;
    private String timeStamp;
    private HttpStatus status;
}
