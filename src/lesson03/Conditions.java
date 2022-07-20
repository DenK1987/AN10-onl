package lesson03;

import java.util.Scanner;
public class Conditions { // ДЗ, часть №1
    public static void main(String[] args) {

        // Задача 1. Написать программу для вывода времени года по номеру месяца. Должно быть 2 варианта
        // реализации: switch-case и if-else-if
        int numberMonth = 8;
        if (numberMonth == 1 || numberMonth == 2 || numberMonth == 12) {
            System.out.println("Winter");
        } else if (numberMonth >= 3 && numberMonth < 6) {
            System.out.println("Spring");
        } else if (numberMonth >= 6 && numberMonth <= 8) {
            System.out.println("Summer");
        } else if (numberMonth > 8 && numberMonth < 12) {
            System.out.println("Autumn");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int numberMonth2 = sc.nextInt();
        switch (numberMonth2) {
            case 1, 2, 12:
                System.out.println("Данный месяц соответствует поре года - " + "Зима");
                break;
            case 3, 4, 5:
                System.out.println("Данный месяц соответствует поре года - " + "Весна");
                break;
            case 6, 7, 8:
                System.out.println("Данный месяц соответствует поре года - " + "Лето");
                break;
            case 9, 10, 11:
                System.out.println("Данный месяц соответствует поре года - " + "Осень");
                break;
            default:
                System.out.println("Месяца с таким номером не существует");
        }
        System.out.println();

        System.out.print("Введите номер месяца: ");
        int numberMonth3 = sc.nextInt();
        switch (numberMonth3) {  // Попробовал добавить на вывод еще и название месяца
            case 1:
                System.out.println("Данный месяц - Январь, пора года - Зима");
                break;
            case 2:
                System.out.println("Данный месяц - Февраль, пора года - Зима");
                break;
            case 3:
                System.out.println("Данный месяц - Март, пора года - Весна");
                break;
            case 4:
                System.out.println("Данный месяц - Апрель, пора года - Весна");
                break;
            case 5:
                System.out.println("Данный месяц - Май, пора года - Весна");
                break;
            case 6:
                System.out.println("Данный месяц - Июнь, пора года - Лето");
                break;
            case 7:
                System.out.println("Данный месяц - Июль, пора года - Лето");
                break;
            case 8:
                System.out.println("Данный месяц - Август, пора года - Лето");
                break;
            case 9:
                System.out.println("Данный месяц - Сентябрь, пора года - Осень");
                break;
            case 10:
                System.out.println("Данный месяц - Октябрь, пора года - Осень");
                break;
            case 11:
                System.out.println("Данный месяц - Ноябрь, пора года - Осень");
                break;
            case 12:
                System.out.println("Данный месяц - Декабрь, пора года - Зима");
                break;
            default:
                System.out.println("Месяца с таким номером не существует");
        }
        System.out.println();

        // Задача 2. Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход
        // будет выводить сообщение о четности числа.
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Данное число является четным");
        } else {
            System.out.println("Данное число является нечетным");
        }
        System.out.println();

        // Задача 3. Для числа t (температура на улице) вывести:
        // - Если t > 15, то вывести «Тепло»
        // - Если t <= 15 и t > -5, то вывести «Нормально»
        // - Если t <= 5, то вывести «Холодно»
        int t = 19;
        if (t > 15) {
            System.out.println("Тепло");
        } else if (t <= 15 && t > -5) {
            System.out.println("Нормально");
        } else if (t <= -5) {
            System.out.println("Холодно");
        }
        System.out.println();

        // Задача 4. По введенному (можно задать явно) номеру определить цвет радуги (1 – красный, 4 – зеленый и т.д.)
        int numberColor = 5;
        switch (numberColor) {
            case 1 -> System.out.println("Красный");   // Программа подсказала упрощенный вариант записи кода
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("У радуги только семь явных цветов");
        }
        System.out.println();

    }
}