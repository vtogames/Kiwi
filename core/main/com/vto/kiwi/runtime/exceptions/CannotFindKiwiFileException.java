package com.vto.kiwi.runtime.exceptions;

public class CannotFindKiwiFileException extends KiwiRuntimeException {
    public CannotFindKiwiFileException(String fileName) {
        super("Cannot find file: " + fileName);
    }
}
