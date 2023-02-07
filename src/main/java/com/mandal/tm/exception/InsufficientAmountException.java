package com.mandal.tm.exception;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String message) {
        super(message);
    }
}
