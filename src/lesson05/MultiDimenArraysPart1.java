package lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArraysPart1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
           Задача 1. Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему
           массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет
           увеличиваться каждый элемент, задается из консоли.
        */
        int[][][] arr1 = new int[2][3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    arr1[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        System.out.println(Arrays.deepToString(arr1) + " - созданный трехмерный массив из целых чисел");
        System.out.print("Введите число, на которое увеличится каждый элемент массива: ");
        int numberIncrease = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    arr1[i][j][k] += numberIncrease;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr1) + " - Измененный массив");
        System.out.println();

        /*
           Задача 2. Шахматная доска. Создайте программу для раскраски шахматной доски с помощью
           цикла. Использовать двумерный массив String размером 8х8. С помощью циклов задать
           элементам значения B (Black) или W (White).
        */
        String[][] arr2 = new String[8][8];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr2[i][j] = "W";
                } else {
                    arr2[i][j] = "B";
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}



