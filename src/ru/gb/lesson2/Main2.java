package ru.gb.lesson2;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        TG2();
        TG3();
        TG4();
    }


    private static void TG2() {
        int[] arr = new int[8];
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void TG3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void TG4() {
        int counter = 1;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = counter;
                if (i == j) { table[i][j] = 1; }
                if (i != j) { table[i][j] = 0; }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
}