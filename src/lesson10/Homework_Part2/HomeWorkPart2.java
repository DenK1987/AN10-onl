package lesson10.Homework_Part2;

import java.util.Scanner;

/**
 * 1. Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
 * 2. Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 * 3. Дана строка произвольной длины с произвольными словами.
 * Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
 * например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
 * 4. Дана произвольная строка. Вывести на консоль новую строку, в которой задублирована каждая буква из
 * начальной строки. Например, "Hello" -> "HHeelllloo".
 */

public class HomeWorkPart2 {

    public static void main(String[] args) {

        // Задача 1.
        String s1 = "Я учусь в школе TeachMeSkills на курсе Android разработчик";
        System.out.println("Созданная строка: " + s1);
        shortestWord(s1); // Выводим на экран самое короткое слово в строке
        longestWord(s1); // Выводим на экран самое короткое слово в строке
        System.out.println();

        // Задача 2.
        String s2 = "fffff ab f 1234 jkjk";
        System.out.println("Созданная строка: " + s2);
        wordWithMinimumNumberOfDifferentCharacters(s2); // Выводим на экран слово, в котором число различных символов минимально
        System.out.println();

        // Задача 3.
        String s3 = "довод казак топор мадам мем ввввввввв 123321 тртртр Кок таран курс палиндром";
        System.out.println("Созданная строка: " + "\"" + s3 + "\"");
        System.out.println("Длина массива подстрок: " + s3.split(" ").length);
        isWordPalindrome(s3); // Проверяем является ли выбранное слово в строке палиндромом и выводим на экран
        System.out.println();

        // Задача 4.
        String s4 = "Hello";
        System.out.println("Созданная строка: " + s4);
        duplicateLettersInString(s4); // Выводим на экран новую строку, в которой задублирована каждая буква из начальной строки

    }


    public static void shortestWord(String s) {
        String[] words = s.split("\\s");
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() <= shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        System.out.println("Самое короткое слово в строке (последнее из имеющихся одинаковых): " + shortestWord);
    }

    public static void longestWord(String s) {
        String[] words = s.split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Самое длинное слово в строке (последнее из имеющихся одинаковых): " + longestWord);
    }

    public static void wordWithMinimumNumberOfDifferentCharacters(String s) {
        String[] words = s.split(" ");
        String searchedWord = words[0];
        int minCountDifferentChars = words[0].length();
        for (int i = 0; i < words.length; i++) {
            char c = words[i].charAt(0);
            int count = 0;
            for (int j = i; j < words[i].length(); j++) {
                if (words[i].charAt(j) != c) {
                    count++;
                }
            }
            if (count < minCountDifferentChars) {
                minCountDifferentChars = count;
                searchedWord = words[i];
            }
        }
        System.out.println("Слово, в котором число различных символов минимально (первое из имеющихся одинаковых): " + searchedWord);
    }

    public static void isWordPalindrome(String str) {
        String[] words = str.split(" ");
        System.out.print("Введите индекс массива, чтобы проверить является слово с заданным индексом в этой строке палиндромом: ");
        Scanner sc = new Scanner(System.in);
        int index;
        while (true) {
            index = sc.nextInt();
            if (index >= words.length) {
                System.out.println("Заданный индекс выходит за длину массива подстрок");
                System.out.print("Введите повторно индекс массива: ");
            } else {
                break;
            }
        }
        if (words[index].equals(new StringBuilder(words[index]).reverse().toString())) {
            System.out.println("Слово " + "\"" + words[index] + "\"" + " с заданным индексом " + index + " является палиндромом");
        } else {
            System.out.println("Слово " + "\"" + words[index] + "\"" + " с заданным индексом " + index + " не является палиндромом");
        }
    }

    public static void duplicateLettersInString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c).append(c);
        }
        System.out.println("Строка, в которой задублирована каждая буква из созданной строки: " + sb);
    }

}
