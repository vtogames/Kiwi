package com.vto.kiwi.runtime.exceptions;

import com.vto.kiwi.runtime.KiwiGlobal;

public class KiwiSyntaxException extends KiwiRuntimeException {

    public KiwiSyntaxException(String msg) {
        super(KiwiGlobal.getActFunction().getName() + ": In line " + KiwiGlobal.getActLine() + ": " + msg);
    }

}
