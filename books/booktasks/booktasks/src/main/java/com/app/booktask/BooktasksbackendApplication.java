package com.app.booktask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * @SpringbootApplication annotation consist:
 * @Component: Controller, Bussiness, Model ... layers
 * @ComponentScan
 * @EnableAutoConfiguration
 */
public class BooktasksbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooktasksbackendApplication.class, args);
    }

}
