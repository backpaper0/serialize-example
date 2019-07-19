package com.example;

import java.io.IOException;
import java.io.Serializable;

import com.example.lib.Store;

public class Baz implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String value;
    private final int length;

    public Baz(final String value) {
        this.value = value;
        this.length = value.length();
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %s)", getClass().getSimpleName(), value, length);
    }

    public static void main(final String[] args) throws ClassNotFoundException, IOException {
        final Baz obj = Store.read(Baz.class);
        System.out.println(obj);
    }
}
