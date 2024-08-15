package com.porto;

import java.util.Arrays;

public class Ex1718 {
    public static void main(String[] args) {
        int[][] m1 = {{0, 1}, {2, 3}};
        int[][] m2 = {{4, 5}, {6, 7}};

        System.out.println(("m1" + Arrays.deepToString(m1)));
        System.out.println(("m2" + Arrays.deepToString(m2)));
        System.out.println(Arrays.deepToString(somaMatrizes(m1, m2)));
        System.out.println(Arrays.deepToString(multiplicaMatrizes(m1, m2)));
    }

    public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
        int[][] matrizResultante = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultante[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return matrizResultante;
    }

    public static int[][] multiplicaMatrizes(int[][] m1, int[][] m2) {
        int[][] matrizResultante = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultante[i][j] = m1[i][j] * m2[i][j];
            }
        }

        return matrizResultante;
    }
}

//17. **Soma de matrizes:** Escreva um programa que some duas matrizes 2x2.
//18. **Multiplicação de matrizes:** Crie um programa que multiplique duas matrizes 2x2.
