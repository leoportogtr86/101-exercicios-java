package com.porto;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

//4. **Entrada de dados:** Crie um programa que solicite ao usuário seu nome e
// idade e depois imprima uma saudação.
