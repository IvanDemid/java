package org.example;

public class Circle extends GeometricFigure {
    public Circle(String color, double radius) {
        super("Круг", color, radius);
    }

    public double getArea() {
        return Math.PI * size * size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Площадь круга: %.2f%n", getArea());
    }
}