package lesson07.Homework_Phone;

/**
 * Класс Phone.
 * Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
 * класса. Выведите на консоль значения их переменных.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
 * сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
 * объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
 * переменных класса - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
 * number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
 * телефона звонящего.
 * Вызвать этот метод.
 * Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
 * телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */

public class MainPhone {

    public static void main(String[] args) {

        Phone phone1 = new Phone(); // Создаем первый объект класса Phone
        phone1.setNumber(5063195); // Устанавливаем ему номер
        phone1.setModel("Vivo V20"); // Присваиваем название модели
        phone1.setWeight(172); // Задаем вес
        // Выводим информацию по первому телефону
        System.out.println("Модель телефона: " + phone1.getModel() + "\n" +
                "Номер телефона: " + phone1.getNumber() + "\n" +
                "Вес телефона: " + phone1.getWeight() + "г");
        System.out.println();

        // Создаем второй объект класса Phone и с помощью конструктора задаем еме номер и модель
        Phone phone2 = new Phone(7101753, "Iphone 12 Pro");
        phone2.setWeight(189); // Задаем вес
        // Выводим информацию по второму телефону
        System.out.println("Модель телефона: " + phone2.getModel() + "\n" +
                "Номер телефона: " + phone2.getNumber() + "\n" +
                "Вес телефона: " + phone2.getWeight() + "г");
        System.out.println();

        // Создаем третий объект класса Phone и с помощью конструктора задаем еме номер, модель и вес
        Phone phone3 = new Phone(5671800,"Xiaomi Redmi 8", 190);
        // Выводим информацию по третьему телефону
        System.out.println("Модель телефона: " + phone3.getModel() + "\n" +
                "Номер телефона: " + phone3.getNumber() + "\n" +
                "Вес телефона: " + phone3.getWeight() + "г");
        System.out.println();

        phone1.receiveCall("Вика"); // Задаем имя звонящего и выводим информацию о звонке на 1-й телефон
        phone2.receiveCall("Зоя"); // Задаем имя звонящего и выводим информацию о звонке на 2-й телефон
        phone3.receiveCall("Денис"); // Задаем имя звонящего и выводим информацию о звонке на 3-й телефон
        System.out.println();

        // Задаем имя звонящего и номер, с которого он звонит, и выводим информацию о звонке на 1-й телефон
        phone1.receiveCall("Вика", phone2.getNumber());
        // Задаем имя звонящего и номер, с которого он звонит, и выводим информацию о звонке на 2-й телефон
        phone2.receiveCall("Зоя", phone3.getNumber());
        // Задаем имя звонящего и номер, с которого он звонит, и выводим информацию о звонке на 3-й телефон
        phone3.receiveCall("Денис", phone1.getNumber());
        System.out.println();

        // Задаем номера телефонов, на которые будет отправлено сообщение с 1-го телефона
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber(), 2105086);

    }
}
