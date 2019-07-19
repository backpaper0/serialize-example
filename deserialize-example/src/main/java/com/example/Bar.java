package com.example;

import java.io.IOException;
import java.io.InvalidClassException;
import java.io.Serializable;

import com.example.lib.Store;

public class Bar implements Serializable {

    private final String value;
    private final int length;

    public Bar(final String value) {
        this.value = value;
        this.length = value.length();
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %s)", getClass().getSimpleName(), value, length);
    }

    public static void main(final String[] args) throws ClassNotFoundException, IOException {
        try {
            Store.read(Bar.class);
        } catch (final InvalidClassException e) {
            e.printStackTrace(System.out);
        }
    }
}
