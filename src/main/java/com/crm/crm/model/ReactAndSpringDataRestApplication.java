package com.crm.crm.model;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ReactAndSpringDataRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
        
        System.out.println("Ejecucion exitosa del modelo Contact");
    }   
}
