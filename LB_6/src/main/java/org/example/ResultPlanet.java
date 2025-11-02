package org.example;

public class ResultPlanet {
    public static void main(String[] args) {
        Continent[] continents = {
                new Continent("Евразия"),
                new Continent("Африка"),
                new Continent("Австралия")
        };

        Ocean[] oceans = {
                new Ocean("Тихий"),
                new Ocean("Атлантический")
        };

        Island[] islands = {
                new Island("Мадагаскар"),
                new Island("Гренландия")
        };

        Planet earth = new Planet("Земля", continents, oceans, islands);

        earth.printPlanetName();
        earth.printContinentNames();
        earth.printContinentCount();
    }
}
