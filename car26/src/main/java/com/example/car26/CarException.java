package com.example.car26;

import lombok.Data;

@Data
public class CarException extends RuntimeException{
    private String internalMessage;
    public CarException(String message,String internalMessage){
        super(message);
        this.internalMessage=internalMessage;

    }
}
