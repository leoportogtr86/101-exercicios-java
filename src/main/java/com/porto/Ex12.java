package com.porto;

public class Ex12 {
    public static void main(String[] args) {
        int[] numeros = {100, 45, 1020, 0, 200};
        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println(maior);
    }
}

//12. **Encontre o maior valor em um array:** Crie um programa que encontre o maior
// número em um array de inteiros.
