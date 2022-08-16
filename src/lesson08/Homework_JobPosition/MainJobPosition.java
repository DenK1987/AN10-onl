package lesson08.Homework_JobPosition;

/**
 * Задача 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности и
 * имплементировать этот метод в созданные классы.
 */

public class MainJobPosition {

    public static void main(String[] args) {

        Printable director = new Director("Начальников");
        Printable worker = new Worker("Работягин");
        Printable accountant = new Accountant("Бухгалтерова");
        System.out.println("Подскажите должности ваших сотрудников?");
        System.out.println("Каких именно?");
        System.out.println("Я знаю только их фамилии: Начальников, Работягин и Бухгалтерова");
        System.out.print("Значит так: Начальников у нас - ");
        director.printJobPosition();
        System.out.print("Работягин - простой ");
        worker.printJobPosition();
        System.out.print("А Бухгалтерова - ");
        accountant.printJobPosition();

    }
}

