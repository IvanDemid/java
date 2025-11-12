package org.example;

import java.util.Scanner;

public class MiddleTwoChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с чётной длиной: ");
        String input = scanner.nextLine();

        if (input.length() % 2 != 0) {
            System.out.println("Ошибка: длина строки должна быть чётной.");
        } else {
            int mid = input.length() / 2;
            String middle = input.substring(mid - 1, mid + 1);
            System.out.println("Два средних символа: " + middle);
        }

        scanner.close();
    }
}
