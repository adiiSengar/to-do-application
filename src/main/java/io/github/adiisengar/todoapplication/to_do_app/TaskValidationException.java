package io.github.adiisengar.todoapplication.to_do_app;

/**
 * Custom exception class to handle task validation errors.
 * This exception is thrown when a task fails validation checks.
 */
public class TaskValidationException extends RuntimeException {

    private String errorCode;

    /**
     * Constructor for TaskValidationException with a custom message.
     * @param message the error message
     */
    public TaskValidationException(String message) {
        super(message);
    }

    /**
     * Constructor for TaskValidationException with a custom message and an error code.
     * @param message the error message
     * @param errorCode the error code for additional context
     */
    public TaskValidationException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * Get the error code associated with this exception.
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Set the error code for this exception.
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Override the toString method to include the error code (if any) in the output.
     * @return the string representation of the exception
     */
    @Override
    public String toString() {
        return "TaskValidationException{" +
                "message='" + getMessage() + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
