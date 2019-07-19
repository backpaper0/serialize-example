package com.example;

import java.io.IOException;
import java.io.Serializable;

import com.example.lib.Store;

public class Foo implements Serializable {

    private final String value;

    public Foo(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", getClass().getSimpleName(), value);
    }

    public static void main(final String[] args) throws ClassNotFoundException, IOException {
        final Foo obj = Store.read(Foo.class);
        System.out.println(obj);
    }
}
