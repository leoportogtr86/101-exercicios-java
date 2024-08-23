package com.porto.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo1 {
    public static void main(String[] args) {
        String path = "src/main/java/com/porto/files/teste.txt";

        try {
            List<String> linhas = Files.readAllLines(Paths.get(path));
            linhas.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
