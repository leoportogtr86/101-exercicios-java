package com.porto;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = sc.nextLine();
        String reverse = new StringBuilder(word).reverse().toString();

        System.out.println("Palavra invertida: " + reverse);
    }
}

//20. **Reversão de string:** Crie um programa que inverta a ordem de uma string fornecida pelo usuário.
