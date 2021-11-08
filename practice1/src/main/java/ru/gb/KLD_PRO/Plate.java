package gb.ru;

public class Plate {
    private int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 500;
        System.out.println("В миску добавили 500 еды");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
