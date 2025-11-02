package org.example;

public class Triangle extends GeometricFigure {
    private double height;

    public Triangle(String color, double base, double height) {
        super("Треугольник", color, base);
        this.height = height;
    }

    public double getArea() {
        return 0.5 * size * height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Высота: " + height);
        System.out.printf("Площадь треугольника: %.2f%n", getArea());
    }
}