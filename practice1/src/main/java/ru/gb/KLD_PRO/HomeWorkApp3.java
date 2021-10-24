package ru.gb.KLD_PRO;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        dataReplacement();
        emptyIntegerArray();
        multiplicationСycle();

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
}
