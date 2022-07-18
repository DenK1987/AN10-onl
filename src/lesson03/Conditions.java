package lesson03;

import java.util.Scanner;

public class Conditions { // ��, ����� �1

    public static void main(String[] args) {

        // ������ 1. �������� ��������� ��� ������ ������� ���� �� ������ ������. ������ ���� 2 ��������
        // ����������: switch-case � if-else-if
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
        System.out.print("������� ����� ������: ");
        int numberMonth2 = sc.nextInt();
        switch (numberMonth2) {
            case 1, 2, 12:
                System.out.println("������ ����� ������������� ���� ���� - " + "����");
                break;
            case 3, 4, 5:
                System.out.println("������ ����� ������������� ���� ���� - " + "�����");
                break;
            case 6, 7, 8:
                System.out.println("������ ����� ������������� ���� ���� - " + "����");
                break;
            case 9, 10, 11:
                System.out.println("������ ����� ������������� ���� ���� - " + "�����");
                break;
            default:
                System.out.println("������ � ����� ������� �� ����������");
        }
        System.out.println();

        System.out.print("������� ����� ������: ");
        int numberMonth3 = sc.nextInt();
        switch (numberMonth3) {  // ���������� �������� �� ����� ��� � �������� ������
            case 1:
                System.out.println("������ ����� - ������, ���� ���� - ����");
                break;
            case 2:
                System.out.println("������ ����� - �������, ���� ���� - ����");
                break;
            case 3:
                System.out.println("������ ����� - ����, ���� ���� - �����");
                break;
            case 4:
                System.out.println("������ ����� - ������, ���� ���� - �����");
                break;
            case 5:
                System.out.println("������ ����� - ���, ���� ���� - �����");
                break;
            case 6:
                System.out.println("������ ����� - ����, ���� ���� - ����");
                break;
            case 7:
                System.out.println("������ ����� - ����, ���� ���� - ����");
                break;
            case 8:
                System.out.println("������ ����� - ������, ���� ���� - ����");
                break;
            case 9:
                System.out.println("������ ����� - ��������, ���� ���� - �����");
                break;
            case 10:
                System.out.println("������ ����� - �������, ���� ���� - �����");
                break;
            case 11:
                System.out.println("������ ����� - ������, ���� ���� - �����");
                break;
            case 12:
                System.out.println("������ ����� - �������, ���� ���� - ����");
                break;
            default:
                System.out.println("������ � ����� ������� �� ����������");
        }
        System.out.println();

        // ������ 2. �������� ���������, ������� ����� ��������� �� ���� ����� (����� ������ ���� � ����) � �� �����
        // ����� �������� ��������� � �������� �����.
        System.out.print("������� �����: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("������ ����� �������� ������");
        } else {
            System.out.println("������ ����� �������� ��������");
        }
        System.out.println();

        // ������ 3. ��� ����� t (����������� �� �����) �������:
        // - ���� t > 15, �� ������� ������
        // - ���� t <= 15 � t > -5, �� ������� ����������
        // - ���� t <= 5, �� ������� ��������
        int t = 19;
        if (t > 15) {
            System.out.println("�����");
        } else if (t <= 15 && t > -5) {
            System.out.println("���������");
        } else if (t <= -5) {
            System.out.println("�������");
        }
        System.out.println();

        // ������ 4. �� ���������� (����� ������ ����) ������ ���������� ���� ������ (1 � �������, 4 � ������� � �.�.)
        int numberColor = 5;
        switch (numberColor) {
            case 1 -> System.out.println("�������");   // ��������� ���������� ���������� ������� ������ ����
            case 2 -> System.out.println("���������");
            case 3 -> System.out.println("������");
            case 4 -> System.out.println("�������");
            case 5 -> System.out.println("�������");
            case 6 -> System.out.println("�����");
            case 7 -> System.out.println("����������");
            default -> System.out.println("� ������ ������ ���� ����� ������");
        }
        System.out.println();


    }
}