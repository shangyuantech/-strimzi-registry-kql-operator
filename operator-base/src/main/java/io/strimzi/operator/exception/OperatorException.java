package io.strimzi.operator.exception;

public class OperatorException extends RuntimeException {

    public OperatorException() {}

    public OperatorException(String message) {
        super(message);
    }

    public OperatorException(String message, Throwable cause) {
        super(message, cause);
    }
}