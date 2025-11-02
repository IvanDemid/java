package org.example;

import java.util.*;

// Первая часть — твой исходный код
public class Z3 {
    public static void main(String[] args) {
        String sentence = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";

        String[] words = sentence.split("\\s+");

        System.out.println("Палиндромы среди числовых слов:");

        for (String word : words) {
            if (word.matches("\\d+")) { // только цифры
                if (isPalindrome(word)) {
                    System.out.println(word);
                }
            }
        }

        System.out.println("\n----------------------------");
        System.out.println("Демонстрация работы с сотрудниками:\n");
        EmployeeDemo.run(); // вызываем вторую часть программы
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

// ===============================
// Вторая часть — про сотрудников
// ===============================

// Абстрактный класс сотрудника
abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double getAverageSalary();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Сотрудник с фиксированной оплатой
class FixedEmployee extends Employee {
    private double fixedSalary;

    public FixedEmployee(int id, String name, double fixedSalary) {
        super(id, name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getAverageSalary() {
        return fixedSalary;
    }
}

// Сотрудник с почасовой оплатой
class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(int id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAverageSalary() {
        // Среднемесячная зарплата по формуле: 20.8 * 8 * hourlyRate
        return 20.8 * 8 * hourlyRate;
    }
}

// Класс для демонстрации работы с коллекцией сотрудников
class EmployeeDemo {
    public static void run() {
        List<Employee> employees = new ArrayList<>();

        // Добавляем сотрудников
        employees.add(new FixedEmployee(1, "Иванов", 40000));
        employees.add(new HourlyEmployee(2, "Петров", 300));
        employees.add(new FixedEmployee(3, "Сидоров", 40000));
        employees.add(new HourlyEmployee(4, "Алексеева", 250));
        employees.add(new FixedEmployee(5, "Кузнецов", 50000));
        employees.add(new HourlyEmployee(6, "Марков", 290));
        employees.add(new FixedEmployee(7, "Зайцева", 45000));
        employees.add(new HourlyEmployee(8, "Васильев", 270));

        // a) Сортировка по убыванию среднемесячной зарплаты, затем по имени
        employees.sort(Comparator
                .comparingDouble(Employee::getAverageSalary).reversed()
                .thenComparing(Employee::getName));

        System.out.println("Полный список сотрудников (сортировка по зарплате ↓ и имени):");
        for (Employee e : employees) {
            System.out.printf("ID: %d | Имя: %-10s | Среднемесячная зарплата: %.2f%n",
                    e.getId(), e.getName(), e.getAverageSalary());
        }

        // b) Первые 5 имён
        System.out.println("\nПервые 5 имён сотрудников:");
        employees.stream()
                .limit(5)
                .map(Employee::getName)
                .forEach(System.out::println);

        // c) Последние 3 идентификатора
        System.out.println("\nПоследние 3 ID сотрудников:");
        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .map(Employee::getId)
                .forEach(System.out::println);
    }
}
