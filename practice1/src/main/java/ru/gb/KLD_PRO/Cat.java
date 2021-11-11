package ru.gb.KLD_PRO;

public class Cat extends Animal {
    public Cat(int runDistance, int swimDistance, float jumpHeight) {
        super(runDistance, swimDistance, jumpHeight);
    }

     private int maxRunDistance = 200;
    private float maxJumpHeight = 2.0F;
    private int maxSwimDistance = 3; //


    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public void run(int distance) {
        System.out.println(distance <= maxRunDistance ? "run: true" : "run: false");
    }

    @Override
    public void jump(float jump) {
        System.out.println(jump <= maxJumpHeight ? "jump: true" : "jump: false");
}

    @Override
    public void swim(double swim) {
        System.out.println(swim <= maxSwimDistance ? "swim: false, Кошки не плавают !");
    }

}
