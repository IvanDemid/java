package org.example;

public class GuineaPig {
    public String name;
    private int age;
    protected String breed;
    String color;


    public GuineaPig() {
        this.name = "Безымянная";
        this.age = 0;
        this.breed = "Неизвестная";
        this.color = "Серый";
    }

    public GuineaPig(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Порода: " + breed);
        System.out.println("Окрас: " + color);
    }

    protected void squeak() {
        System.out.println(name + " говорит: Пииии!");
    }
}