public class Main {
    public static void main(String[] args) {
        ElectronicDevice laptop = new Laptop("Vanya");
        ElectronicDevice smartphone = new Smartphone("Vanya");

        laptop.turnOn();       // Вывод: Ноутбук загружается...
        smartphone.turnOn();   // Вывод: Смартфон включается...
    }
}
