package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс Student
class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void nextCourse() {
        this.course++;
    }

    // Средний балл
    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return name + " (" + group + "), курс: " + course + ", ср. балл: " + String.format("%.2f", getAverageGrade());
    }
}

public class Z2 {

    // Метод для удаления студентов с баллом < 3 и перевода остальных
    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3) {
                iterator.remove(); // удаляем студента
            } else {
                s.nextCourse(); // переводим на следующий курс
            }
        }
    }

    // Метод для вывода студентов определенного курса
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("- " + s.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Создаем коллекцию студентов
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иван Иванов", "A-01", 1, List.of(4, 5, 3, 4)));
        students.add(new Student("Петр Петров", "A-01", 1, List.of(2, 3, 2, 3)));
        students.add(new Student("Сергей Сергеев", "B-02", 2, List.of(5, 4, 5, 4)));
        students.add(new Student("Анна Смирнова", "B-02", 2, List.of(3, 3, 3, 3)));
        students.add(new Student("Мария Кузнецова", "C-03", 3, List.of(2, 2, 2, 3)));

        System.out.println("До обработки:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Обрабатываем студентов
        processStudents(students);

        System.out.println("\nПосле обработки:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Выводим студентов 2-го и 3-го курсов
        System.out.println();
        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);
    }
}
