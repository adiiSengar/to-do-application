package io.github.adiisengar.todoapplication.to_do_app;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler to catch all exceptions and return meaningful responses.
 */
@RestControllerAdvice

public class GlobalExceptionHaandler {
    /**
     * Handles TaskNotFoundException and returns a custom error message with 404 Not Found status.
     *
     * @param ex The TaskNotFoundException
     * @return ResponseEntity with error message and 404 status
     */
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<String> handleTaskNotFound(TaskNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    /**
     * Handles all other exceptions and returns a generic error message with 500 Internal Server Error.
     *
     * @param ex The exception
     * @return ResponseEntity with error message and 500 status
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex) {
        return new ResponseEntity<>("An unexpected error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}






