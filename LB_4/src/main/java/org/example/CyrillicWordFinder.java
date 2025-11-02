package org.example;

import java.util.regex.*;
import java.util.*;

public class CyrillicWordFinder {
    public static void main(String[] args) {
        String text = "ааа ббб ёёё ззз ййй ААА БББ ЁЁЁ ЗЗЗ ЙЙЙ";

        Pattern pattern = Pattern.compile("\\b[а-яА-ЯёЁ]+\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();

        while (matcher.find()) {
            words.add(matcher.group());
        }

        System.out.println("Найденные слова:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}