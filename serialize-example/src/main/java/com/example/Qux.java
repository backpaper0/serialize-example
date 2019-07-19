package com.example;

import java.io.IOException;
import java.io.Serializable;

import com.example.lib.Store;

public class Qux implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String value;

    public Qux(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", getClass().getSimpleName(), value);
    }

    public static void main(final String[] args) throws IOException {
        final Qux obj = new Qux("Hello World");
        System.out.println(obj);
        Store.write(obj);
    }
}
