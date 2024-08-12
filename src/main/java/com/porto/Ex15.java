package com.porto;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};

        System.out.println(Arrays.toString(getDobro(numeros)));
    }

    public static int[] getDobro(int[] numeros) {
        int[] dobro = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            dobro[i] = numeros[i] * 2;
        }

        return dobro;
    }
}

//15. **Função com retorno de array:** Crie uma função que receba um array de inteiros e
// retorne um array com os valores dobrados.