package com.yeepay.myspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MySpringBootprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootprojectApplication.class, args);
    }
}
