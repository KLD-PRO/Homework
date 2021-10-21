package ru.gb.KLD_PRO;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        TwoNumbers(); {
            System.out.println(TwoNumbers());
        }
        PositiveNegative ();
        PositiveNegative2 (); {
            System.out.println(PositiveNegative2 ());
        }
    }
    public static boolean TwoNumbers () {
        int a = 13, b = 37;
        int c = a + b;
        if (10 >= c || c <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void PositiveNegative () {
        int val = 0;
        if (val < 0) {
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Положительное");
        }
    }
    public static boolean PositiveNegative2 () {
        int mol = -5;
        return mol < 0;
    }
}
