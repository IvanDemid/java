package org.example;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Красный", 5.0);
        Rectangle rectangle = new Rectangle("Синий", 4.0, 6.0);
        Triangle triangle = new Triangle("Зелёный", 3.0, 4.0);

        circle.displayInfo();
        System.out.println();

        rectangle.displayInfo();
        System.out.println();

        triangle.displayInfo();
    }
}