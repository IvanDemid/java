package org.example;

public class DigitPalindromeFinder {
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
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
