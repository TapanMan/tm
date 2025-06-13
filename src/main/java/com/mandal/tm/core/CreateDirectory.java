package com.mandal.tm.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

    public static void createPath() {
        try {
            Path path = Paths.get("Dataset");
            if (Files.exists(path)) {
                System.out.println("Path Already Exists");
            } else {
                Path createPath = Files.createDirectory(path);
                System.out.println("Path Created at " + createPath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        createPath();
    }
}
