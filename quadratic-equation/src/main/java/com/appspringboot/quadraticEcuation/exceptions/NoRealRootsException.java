package com.appspringboot.quadraticEcuation.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoRealRootsException extends RuntimeException {
    public NoRealRootsException(String message) {
        super(message);
        log.error(message);
    }
}
