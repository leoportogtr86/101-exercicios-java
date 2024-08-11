package com.porto;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(soma(10, 5));
        System.out.println(subtrai(10, 5));
        System.out.println(multiplica(10, 5));
        System.out.println(divide(10, 5));
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrai(int a, int b) {
        return a - b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }
}

//3. **Operações aritméticas:** Escreva um programa que some, subtraia, multiplique e
// divida dois números inteiros.
