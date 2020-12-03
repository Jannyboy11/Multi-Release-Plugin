package com.example.multirelease;

public class Release {

    private static final String RELEASE = "Release 11";

    private Release() {}

    public static String get() {
        return RELEASE;
    }
}
