package com.company;

import java.io.Serial;

public class NameFormatException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }
}
