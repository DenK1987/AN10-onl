package lesson03;

import java.util.Scanner;

public class AdditionalTasks { // ДЗ (необязательная часть)

    public static void main(String[] args) {

        // Задача 1. Выведите на экран первых 11 членов последовательности Фибоначчи.
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        int f4;
        System.out.print(f1 + " " + f2 + " " + f3 + " ");
        for (int i = 4; i <= 11; i++) {
            f4 = f2 + f3;
            System.out.print(f4 + " ");
            f2 = f3;
            f3 = f4;
        }
        System.out.println("\n");

        // Задача 2. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которую
        // пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада
        // с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов
        // используйте цикл for.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада = ");
        double depositAmount = sc.nextDouble();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = sc.nextInt();
        for (int i = 1; i <= period; i++) {
            depositAmount = 1.07 * depositAmount;
        }
        System.out.println(depositAmount);
        System.out.println();

        // Задача 3. Напишите программу, которая выводит в консоль таблицу умножения.
        System.out.print(" x |");
        for (int i = 1; i <= 10; i++)
            System.out.printf("%2d ", i);
        System.out.print("\n---|-------------");
        System.out.print("----------------\n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.print("\n");
        }

    }
}
