package com.example.myBook.exception;

import lombok.Data;

@Data
public class OurException extends RuntimeException {
    private String internalMessage;

    public OurException(String message, String internalMessage) {
        super(message);
        this.internalMessage = internalMessage;
    }
}
