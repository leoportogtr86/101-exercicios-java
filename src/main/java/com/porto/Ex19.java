package com.porto;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String text = sc.nextLine();
        System.out.println("Comprimento: " + text.length());
        System.out.println("Primeira letra: " + text.charAt(0));
        System.out.println("Última letra: " + text.charAt(text.length() - 1));
    }
}

//19. **Manipulação de Strings:** Escreva um programa que leia uma string e imprima seu
// comprimento, primeira e última letra.