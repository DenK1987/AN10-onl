package lesson10.Homework_Part3;

import java.util.Scanner;

/**
 * Создать класс, в котором будет статический метод. Этот метод принимает на вход три параметра:
 * Login, Password, confirmPassword.
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должна содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должна содержать пробелы и должна
 * содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя
 * конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в
 * конструктор класса Exception.
 * Метод возвращает true, если значения верны или false в другом случае.
 */

public class HomeWorkPart3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();
        System.out.print("Подтверждение пароля: ");
        String confirmPassword = sc.nextLine();
        try {
            WorkingWithData.login(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }
}
