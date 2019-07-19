package com.example;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.Serializable;

import com.example.lib.Store;

public class Qux implements Serializable {

    private static final long serialVersionUID = 1L;
    private String value;
    private int length;

    public Qux(final String value) {
        this.value = value;
        this.length = value.length();
    }

    private void readObject(final java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        final GetField fields = in.readFields();
        value = (String) fields.get("value", null);
        length = fields.get("length", value.length());
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %s)", getClass().getSimpleName(), value, length);
    }

    public static void main(final String[] args) throws ClassNotFoundException, IOException {
        final Qux obj = Store.read(Qux.class);
        System.out.println(obj);
    }
}
