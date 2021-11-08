package gb.ru;

public class FeedCats {
    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Маркиз", 30, 6);
        cat[1] = new Cat("Герцог", 150, 5);
        cat[2] = new Cat("Лорд", 500, 8);
        Plate plate = new Plate(700);
        System.out.println("Доброго времени суток! У нас есть три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", которые едят каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " час(а).");
        System.out.println("Сейчас в миске " + plate.getFood() + " еды.\n");

        do {
            for (Cat i : cat) {


                if (i.getSatiety() == 0) {


                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }


                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " еды и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }


                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС  начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " еды.\n");
            TIME++;

        } while (TIME <= 24);
    }
}
