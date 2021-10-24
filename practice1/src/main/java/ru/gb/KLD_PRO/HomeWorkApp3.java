package ru.gb.KLD_PRO;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        dataReplacement();
        emptyIntegerArray();
        multiplicationСycle();
        squareTwoDimensionalIntegerArray();
        System.out.println(Arrays.toString(returnArray(3,5)));

    }

    public static void dataReplacement() {
        int [] abc = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < abc.length; i++) {
            abc [i] = (abc [i] > 0) ? 0 : 1;
            System.out.print(abc [i] + " ");
        }

    }

    public static void emptyIntegerArray() {
        System.out.println();
        int [] gr = new int [100];
        for (int i = 0; i < gr.length; i++) {
            gr [i] = i + 1;
            System.out.print(gr [i] + " ");
        }
    }
    public static void multiplicationСycle () {
        System.out.println();
        int [] aaa = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i] < 6) {
                aaa[i] = aaa[i] * 2;
            }
            System.out.print(aaa[i] + " ");
        }
    }
    public static void squareTwoDimensionalIntegerArray () {
        System.out.println();
        int[][] arr = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] returnArray(int len, int initialValue) {
        int[] fsb = new int[len];
        for (int i = 0; i < len; i++) {
            fsb[i] = initialValue;
        }
        return fsb;
    }

}
