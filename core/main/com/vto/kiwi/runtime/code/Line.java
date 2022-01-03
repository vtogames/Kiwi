package com.vto.kiwi.runtime.code;

public class Line {

    private int lineNumber = 0;
    private String rawLineContents = "";

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getRawLineContents() {
        return rawLineContents;
    }

    public void setRawLineContents(String rawLineContents) {
        this.rawLineContents = rawLineContents;
    }
}
