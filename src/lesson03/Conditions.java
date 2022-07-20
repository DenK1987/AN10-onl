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
        String season;
        String s = "Данный месяц соответствует поре года - ";
        switch (numberMonth2) {
            case 1, 2, 12:
                season = s + "Зима";
                break;
            case 3, 4, 5:
                season = s + "Весна";
                break;
            case 6, 7, 8:
                season = s + "Лето";
                break;
            case 9, 10, 11:
                season = s + "Осень";
                break;
            default:
                season = "Данного месяца не существует";
        }
        System.out.println(season);
        System.out.println();

        System.out.print("Введите номер месяца: ");
        int numberMonth3 = sc.nextInt();
        String season2;
        String month2;
        switch (numberMonth3) {  // Попробовал добавить на вывод еще и название месяца
            case 1:
                month2 = "Январь";
                season2 = "Зима";
                break;
            case 2:
                month2 = "Февраль";
                season2 = "Зима";
            case 3:
                month2 = "Март";
                season2 = "Весна";
                break;
            case 4:
                month2 = "Апрель";
                season2 = "Весна";
                break;
            case 5:
                month2 = "Май";
                season2 = "Весна";
                break;
            case 6:
                month2 = "Июнь";
                season2 = "Лето";
                break;
            case 7:
                month2 = "Июль";
                season2 = "Лето";
                break;
            case 8:
                month2 = "Август";
                season2 = "Лето";
                break;
            case 9:
                month2 = "Сентябрь";
                season2 = "Осень";
                break;
            case 10:
                month2 = "Октябрь";
                season2 = "Осень";
                break;
            case 11:
                month2 = "Ноябрь";
                season2 = "Осень";
                break;
            case 12:
                month2 = "Декабрь";
                season2 = "Зима";
                break;
            default:
                month2 = "Отсутствует";
                season2 = "Отсутствует";
        }
        System.out.println("Данный месяц - " + month2 + ", пора года - " + season2);
        System.out.println();

        // Задача 2. Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход
        // будет выводить сообщение о четности числа.
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        String evenOdd;
        if (number % 2 == 0) {
            evenOdd = "Данное число является четным";
        } else {
            evenOdd = "Данное число является нечетным";
        }
        System.out.println(evenOdd);
        System.out.println();

        // Задача 3. Для числа t (температура на улице) вывести:
        // - Если t > 15, то вывести «Тепло»
        // - Если t <= 15 и t > -5, то вывести «Нормально»
        // - Если t <= 5, то вывести «Холодно»
        int t = 19;
        String condition;
        if (t > 15) {
            condition = "Тепло";
        } else if (t > -5) {
            condition = "Нормально";
        } else {
            condition = "Холодно";
        }
        System.out.println(condition);
        System.out.println();

        // Задача 4. По введенному (можно задать явно) номеру определить цвет радуги (1 – красный, 4 – зеленый и т.д.)
        int numberColor = 5;
        String color;
        switch (numberColor) {
            case 1 -> color = "Красный";   // Программа подсказала упрощенный вариант записи кода
            case 2 -> color = "Оранжевый";
            case 3 -> color = "Желтый";
            case 4 -> color = "Зеленый";
            case 5 -> color = "Голубой";
            case 6 -> color = "Синий";
            case 7 -> color = "Фиолетовый";
            default -> color = "У радуги только семь явных цветов";
        }
        System.out.println(color);
        System.out.println();

    }
}