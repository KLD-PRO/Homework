package ru.gb.KLD_PRO;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        dataReplacement();
    }

    public static void dataReplacement() {
        int [] abc = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < abc.length; i++) {
            abc [i] = (abc [i] > 0) ? 0 : 1;
            System.out.print(abc [i]);
        }

    }
}
