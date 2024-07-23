package com.Annotasiyon.Companent;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Demo {
    @PostConstruct
    public void ss(){
        System.out.println("ii");
    }
    @PreDestroy
    public void hh(){
        System.out.println("ll");
    }
}
