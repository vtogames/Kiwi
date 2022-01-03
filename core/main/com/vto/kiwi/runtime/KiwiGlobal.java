package com.vto.kiwi.runtime;

import com.vto.kiwi.runtime.function.Function;

public class KiwiGlobal {

    private static int actLine = 0;
    private static Function actFunction;
    private static String applicationName = "Kiwi Application";

    public static int getActLine() {
        return actLine;
    }

    public static void setActLine(int actLine) {
        KiwiGlobal.actLine = actLine;
    }

    public static Function getActFunction() {
        return actFunction;
    }

    public static void setActFunction(Function actFunction) {
        KiwiGlobal.actFunction = actFunction;
    }

    public static String getApplicationName() {
        return applicationName;
    }

    public static void setApplicationName(String applicationName) {
        KiwiGlobal.applicationName = applicationName;
    }
}
