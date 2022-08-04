package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {  // ДЗ, часть №1

    public static void main(String[] args) {

        /*
           Задача 1. Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
           входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
           (класс Scanner).
        */
        int[] arr1 = {1, 2, 5, 1, 9, 6};
        System.out.println(Arrays.toString(arr1) + " - созданный массив целых чисел");
        System.out.print("Введите число, чтобы проверить, входит ли оно в массив: ");
        Scanner sc = new Scanner(System.in);
        int numberArray = sc.nextInt();
        String s = " не входит в массив";
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == numberArray) {
                s = " входит в массив";
                break;
            }
        }
        System.out.println("Заданное число " + numberArray + s + " " + Arrays.toString(arr1));
        System.out.println();

        /*
           Задача 2. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
           число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
           об этом.
        */
        int[] arr2 = {6, 202, 555, 12, 9995, 67, 6, 47};
        System.out.println(Arrays.toString(arr2) + " - созданный массив целых чисел");
        System.out.print("Введите число, чтобы удалить из массива: ");
        int numberFromDelete = sc.nextInt();
        int count = 0;
        for (int el : arr2) {
            if (el == numberFromDelete) {
                count++;
            }
        }
        String s1;
        if (!(count > 0)) {
            s1 = "Заданного числа нет в массиве " + Arrays.toString(arr2);
        } else {
            int[] newArr2 = new int[arr2.length - count];
            for (int i = 0, j = 0; i < arr2.length; i++) {
                if (arr2[i] != numberFromDelete) {
                    newArr2[j] = arr2[i];
                    j++;
                }
            }
            s1 = Arrays.toString(newArr2) + " - новый массив после удаления заданного числа";
        }
        System.out.println(s1);
        System.out.println();

        /*
           Задача 3. Создайте и заполните массив случайными числами и выведите минимальное,
           максимальное и среднее значение. Для генерации случайного числа используйте метод
           Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
           размер массива вводится с консоли.
        */
        System.out.print("Введите размер массива: ");
        int sizeArray = sc.nextInt();
        int[] arr3 = new int[sizeArray];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr3) + " - созданный массив с длиной " + arr3.length + " и заполненный случайными целыми числами");
        int minValue = arr3[0];
        int maxValue = arr3[0];
        int sumValue = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < minValue) {
                minValue = arr3[i];
            }
            if (arr3[i] > maxValue) {
                maxValue = arr3[i];
            }
            sumValue += arr3[i];
        }
        System.out.println("Минимальное значение массива - " + minValue + "\n" +
                "Максимальное значение массива - " + maxValue + "\n" +
                "Среднее значение массива - " + ((double) sumValue / arr3.length));
        System.out.println();

        /*
           Задача 4. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
           Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
           из массивов это значение оказалось больше (либо сообщите, что их средние
           арифметические равны).
        */
        int[] arr4 = new int[5];
        int[] arr5 = new int[5];
        int sumValueArr4 = 0;
        int sumValueArr5 = 0;
        for (int i = 0; i < 5; i++) {
            arr4[i] = (int) (Math.random() * 50);
            arr5[i] = (int) (Math.random() * 50);
            sumValueArr4 += arr4[i];
            sumValueArr5 += arr5[i];
        }
        System.out.println(Arrays.toString(arr4) + " - первый созданный массив");
        System.out.println(Arrays.toString(arr5) + " - второй созданный массив");
        double averageValueArr4 = (double) sumValueArr4 / 5;
        double averageValueArr5 = (double) sumValueArr5 / 5;
        String result;
        if (averageValueArr4 > averageValueArr5) {
            result = "Среднее арифметическое значение первого массива - " + averageValueArr4 + " больше чем второго - " + averageValueArr5;
        } else if (averageValueArr4 < averageValueArr5) {
            result = "Среднее арифметическое значение второго массива - " + averageValueArr5 + " больше чем первого - " + averageValueArr4;
        } else {
            result = "Средние арифметические значения двух массивов равны";
        }
        System.out.println(result);

    }
}



