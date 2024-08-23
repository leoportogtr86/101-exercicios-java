package com.porto.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    public static void main(String[] args) {
        String path = "src/main/java/com/porto/files/teste1.txt";
        String conteudo = "Novo conteúdo";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(conteudo);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
