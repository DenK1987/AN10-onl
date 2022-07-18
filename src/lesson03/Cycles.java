package lesson03;

import java.util.Scanner;

public class Cycles { // ��, ����� �2

    public static void main(String[] args) {

        // ������ 1. ��� ������ ����� for ������� �� ����� �������� ����� �� 1 �� 99. (������������ ���������)
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // ������ 2. ��� ������ ����� for ������� �� ����� ����� �� 15 �� 1. (������������ ���������)
        for (int i = 15; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ������ 3. �������� ���������, ��� ������������ ������ ����� ����� ������������� ����� - N. ���������
        // ��������� ��� ����� �� 1 �� N. ��� ����� ����� ����������� ����� Scanner.
        System.out.print("������� �����: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
            if (i == number) {
                System.out.println("����� ����� �� 1 �� " + number + " = " + result);
            }
        }
        System.out.println();

        // ������ 4. �������� ���������, ������� ����� �������� �� ����� ����� ������������������: 7 14 21 28 35 42
        // 49 56 63 70 77 84 91 98. � ������� ������������ ���� while
        int count = 6;
        while (count <= 98) {
            if (++count % 7 == 0) {
                System.out.print(count + " ");
            }
        }
        System.out.println("\n");

        // ������ 5. ������� 10 ������ ����� ������������������ 0, -5, -10, -15...
        for (int i = 0; i >= -45; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // ������ 6. ��������� ���������, ��������� �� ����� �������� ����� �� 10 �� 20 ������������
        int numberSquare = 0;
        for (int i = 10; i <= 20; i++) {
            numberSquare = i * i;
            System.out.print(numberSquare + " ");
        }
        System.out.println();


    }
}