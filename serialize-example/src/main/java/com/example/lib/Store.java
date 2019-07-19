package com.example.lib;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Store {

    public static void write(final Object obj) throws IOException {
        final Path file = Paths.get("../temp/" + obj.getClass().getSimpleName() + ".ser");
        System.out.println("write: " + file);
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(file))) {
            out.writeObject(obj);
            out.flush();
        }
    }
}
