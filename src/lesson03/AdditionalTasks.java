package lesson03;

import java.util.Scanner;

public class AdditionalTasks { // �� (�������������� �����)

    public static void main(String[] args) {

        // ������ 1. �������� �� ����� ������ 11 ������ ������������������ ���������.
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

        // ������ 2. �� ������ ����� ���� ��������� � ����� ������ 7% �� �����. �������� ���������, � �������
        // ������������ ������ ����� ������ � ���������� �������. � ���� ��������� �������� ����� ������
        // � ������ ���������� ��������� �� ������ �����. ��� ���������� ����� � ������ ���������
        // ����������� ���� for.
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ����� ������ = ");
        double depositAmount = sc.nextDouble();
        System.out.print("������� ���� ������ � �������: ");
        int period = sc.nextInt();
        for (int i = 1; i <= period; i++) {
            depositAmount = 1.07 * depositAmount;
            System.out.println(depositAmount);
        }
        System.out.println();

        // ������ 3. �������� ���������, ������� ������� � ������� ������� ���������.
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
