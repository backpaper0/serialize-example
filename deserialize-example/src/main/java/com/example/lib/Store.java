package com.example.lib;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Store {

    public static <T> T read(final Class<T> clazz) throws IOException, ClassNotFoundException {
        final Path file = Paths.get("../temp/" + clazz.getSimpleName() + ".ser");
        System.out.println("read: " + file);
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(file))) {
            return clazz.cast(in.readObject());
        }
    }
}
