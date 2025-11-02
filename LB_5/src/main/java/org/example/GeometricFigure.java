package org.example;

public class GeometricFigure {
    protected String name;
    protected String color;
    protected double size; // может быть радиус, сторона, длина и т.д.

    public GeometricFigure(String name, String color, double size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("Фигура: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Размер: " + size);
    }
}