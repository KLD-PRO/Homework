package ru.gb.KLD_PRO;

public class HomeWorkApp<sout> {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1, b = 2;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else if (c < 0) System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 11;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 101) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers()    {
        int a = 5, b = 10;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
