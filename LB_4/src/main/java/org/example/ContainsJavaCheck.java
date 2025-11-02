package org.example;

import java.util.Scanner;

public class ContainsJavaCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.contains("Java")) {
            System.out.println("Строка содержит подстроку \"Java\"");
        } else {
            System.out.println("Строка не содержит подстроку \"Java\"");
        }

        scanner.close();
    }
}