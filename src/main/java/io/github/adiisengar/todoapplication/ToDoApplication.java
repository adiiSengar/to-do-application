package io.github.adiisengar.todoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Spring Boot To-Do Application.
 * This class is the entry point of the application.
 */
@SpringBootApplication
public class ToDoApplication {

    /**
     * The main method that launches the Spring Boot application.
     * @param args The main method that launches the Spring Boot application.
     */
    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);
    }

}
