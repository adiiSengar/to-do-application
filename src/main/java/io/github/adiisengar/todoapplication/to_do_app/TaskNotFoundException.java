package io.github.adiisengar.todoapplication.to_do_app;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
