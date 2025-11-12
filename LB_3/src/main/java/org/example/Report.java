package org.example;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчёт о зарплатах сотрудников:");
        for (Employee emp : employees) {
            System.out.printf("%-15s %10.2f%n", emp.fullname, emp.salary);
        }
    }

    public static void main(String[] args) {
        Employee[] staff = {
                new Employee("Иванов И.И.", 1200.50),
                new Employee("Петров П.П.", 980.75),
                new Employee("Сидоров С.С.", 1500.00),
                new Employee("Кузнецов К.К.", 1100.25)
        };

        generateReport(staff);
    }
}
