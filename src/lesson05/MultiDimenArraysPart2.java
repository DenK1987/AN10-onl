package lesson05;

import java.util.Arrays;

public class MultiDimenArraysPart2 {

    public static void main(String[] args) {

        /*
           Задача 1. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите
           программу для умножения двух матриц.
        */
        int[][] arr1 = {{5, 3, 1}, {2, 4, 6}, {7, 8, 9}};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 40}, {30, 20, 10}};
        int[][] multiArr1Arr2 = new int[3][3];
        System.out.println("Результат умножения двух матриц: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < multiArr1Arr2.length; k++) {
                    multiArr1Arr2[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < multiArr1Arr2.length; i++) {
            System.out.printf("%-12s%s%15s   %s%18s\n",
                    Arrays.toString(arr1[i]),
                    i == 1 ? "*" : " ",
                    Arrays.toString(arr2[i]),
                    i == 1 ? "=" : " ",
                    Arrays.toString(multiArr1Arr2[i]));
        }
        System.out.println();

        // Задача 2. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов.
        int[][] arr3 = new int[5][5];
        int sumValue = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = (int) ((Math.random() * 90) + 10);
                sumValue += arr3[i][j];
            }
            System.out.printf("%s%s\n",
                    Arrays.toString(arr3[i]),
                    i == 2 ? " - созданный двумерный массив из целых чисел" : " ");
        }
        System.out.println(sumValue + " - сумма всех элементов массива");
        System.out.println();

        // Задача 3. Создайте двумерный массив. Выведите на консоль диагонали массива.
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = (int) (Math.random() * 10);
            }
            System.out.printf("%s%s\n", Arrays.toString(arr4[i]),
                    i == 2 ? " - созданный двумерный массив" : " ");
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i][i] + " ");
        }
        System.out.println(" - первая диагональ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i][arr4[i].length - 1 - i] + " ");
        }
        System.out.println(" - вторая диагональ");
        System.out.println();

        /*
           Задача 4. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по
           возрастанию.
        */
        int[][] arr5 = new int[2][4];
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(arr5) + " - созданный двумерный массив из целых чисел");
        for (int i = 0; i < arr5.length; i++) {
            Arrays.sort(arr5[i]);
        }
        System.out.println(Arrays.deepToString(arr5) + " - отсортированный массив ");

    }
}
