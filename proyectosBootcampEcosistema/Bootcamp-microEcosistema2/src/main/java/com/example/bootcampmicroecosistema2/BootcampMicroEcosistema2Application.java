package com.example.bootcampmicroecosistema2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.bootcampmicroecosistema1", "com.example.bootcampmicroecosistema2"})
public class BootcampMicroEcosistema2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootcampMicroEcosistema2Application.class, args);
    }

}
