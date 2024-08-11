package com.porto;

public class Ex10 {
    public static void main(String[] args) {
        int[] inteiros = {1, 2, 3, 4, 5};
        int[] inteiros1 = new int[5];

        inteiros1[0] = 10;
        inteiros1[1] = 20;
        inteiros1[2] = 30;
        inteiros1[3] = 40;
        inteiros1[4] = 50;

        for (int inteiro : inteiros) {
            System.out.println(inteiro);
        }
        System.out.println("xxxxxxxxxxxx");
        for (int inteiro : inteiros1) {
            System.out.println(inteiro);
        }
    }
}

//10. **Array simples:** Crie um programa que declare um array de inteiros e imprima todos os elementos.
