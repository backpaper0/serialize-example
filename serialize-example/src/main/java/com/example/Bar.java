package com.example;

import java.io.IOException;
import java.io.Serializable;

import com.example.lib.Store;

public class Bar implements Serializable {

    private final String value;

    public Bar(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", getClass().getSimpleName(), value);
    }

    public static void main(final String[] args) throws IOException {
        final Bar obj = new Bar("Hello World");
        System.out.println(obj);
        Store.write(obj);
    }
}
