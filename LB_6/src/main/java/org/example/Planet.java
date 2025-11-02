package org.example;

public class Planet {
    private String name;
    private Continent[] continents;
    private Ocean[] oceans;
    private Island[] islands;

    public Planet(String name, Continent[] continents, Ocean[] oceans, Island[] islands) {
        this.name = name;
        this.continents = continents;
        this.oceans = oceans;
        this.islands = islands;
    }

    public void printPlanetName() {
        System.out.println("Планета: " + name);
    }

    public void printContinentNames() {
        System.out.println("Материки:");
        for (Continent continent : continents) {
            System.out.println("- " + continent.getName());
        }
    }

    public void printContinentCount() {
        System.out.println("Количество материков: " + continents.length);
    }
}