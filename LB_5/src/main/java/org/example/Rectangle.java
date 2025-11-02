package org.example;

public class Rectangle extends GeometricFigure {
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Прямоугольник", color, width);
        this.height = height;
    }

    public double getArea() {
        return size * height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Высота: " + height);
        System.out.printf("Площадь прямоугольника: %.2f%n", getArea());
    }
}