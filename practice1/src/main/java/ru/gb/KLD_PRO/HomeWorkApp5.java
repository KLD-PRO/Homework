package ru.gb.KLD_PRO;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee [] employees = {
            new Employee("LukeSkywalker", "Jedi", "LK@mail.ru", "456-123", 100, 23),
                    new Employee("ObiVanKenobi", "MasterJedi", "OVK@mail.ru", "456-124", 1000, 35),
                    new Employee("MaceVindu", "MasterJedi2", "MV@mail.ru", "456-125", 10000, 40),
                    new Employee("Yoda", "GrandMasterJedi", "Yo@mail.ru", "456-100", 100000, 200),
                    new Employee("DartSidius", "Sith", "DarkEmperor@mail.ru", "666", 1000000, 66),
        };
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i]);
            }
        }
    }

}
