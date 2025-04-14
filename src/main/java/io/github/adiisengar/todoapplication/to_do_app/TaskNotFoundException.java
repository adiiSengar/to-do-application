package io.github.adiisengar.todoapplication.to_do_app;
/**
 * Custom exception class to handle cases where a task is not found.
 * This exception extends RuntimeException, so it's unchecked and can be
 * thrown during runtime without needing to be declared in method signatures.
 */

public class TaskNotFoundException extends RuntimeException {
  /**
   * Constructor to create a new instance of TaskNotFoundException.
   * It accepts a message which is passed to the superclass (RuntimeException).
   *
   * @param message The message that will be shown when the exception is thrown.
   */
  public TaskNotFoundException(String message) {
    super(message);
  }
}
