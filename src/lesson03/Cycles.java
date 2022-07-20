package lesson03;

import java.util.Scanner;

public class Cycles { // ДЗ, часть №2

    public static void main(String[] args) {

        // Задача 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99. (использовать инкремент)
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // Задача 2. При помощи цикла for вывести на экран числа от 15 до 1. (использовать декремент)
        for (int i = 15; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 3. Напишите программу, где пользователь вводит любое целое положительное число - N. Программа
        // суммирует все числа от 1 до N. Для ввода числа используйте класс Scanner.
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
            if (i == number) {
                System.out.println("Сумма чисел от 1 до " + number + " = " + result);
            }
        }
        System.out.println();

        // Задача 4. Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42
        // 49 56 63 70 77 84 91 98. В решении использовать цикл while
        int count = 6;
        while (count <= 98) {
            if (++count % 7 == 0) {
                System.out.print(count + " ");
            }
        }
        System.out.println("\n");

        // Задача 5. Вывести 10 первых чисел последовательности 0, -5, -10, -15...
        for (int i = 0; i >= -45; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // Задача 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
        int numberSquare;
        for (int i = 10; i <= 20; i++) {
            numberSquare = i * i;
            System.out.print(numberSquare + " ");
        }
        System.out.println();

    }
}