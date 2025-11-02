package org.example;

public class Main {
    public static void main(String[] args) {

        GuineaPig pig1 = new GuineaPig();
        pig1.displayInfo();
        System.out.println();

        GuineaPig pig2 = new GuineaPig("Пуфик", 2, "Английский кудрявый", "Белый");
        pig2.displayInfo();
        System.out.println();

        pig2.setAge(3);
        System.out.println("Обновлённый возраст Пуфика: " + pig2.getAge());

        pig2.squeak();
    }
}