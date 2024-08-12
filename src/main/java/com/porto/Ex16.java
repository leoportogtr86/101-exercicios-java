package com.porto;

import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 2;

        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[1][2] = 5;

        matriz[2][0] = 6;
        matriz[2][1] = 7;
        matriz[2][2] = 8;

        System.out.println(Arrays.deepToString(matriz));
    }
}

//16. **Matrizes (arrays 2D):** Crie um programa que declare e inicialize uma
// matriz 3x3 e imprima seus valores.
