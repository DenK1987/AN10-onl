package lesson07.Homework_Phone;

/**
 * Класс, описывающий телефон
 */

public class Phone {
    /**
     * Номер телефона
     */
    private int number;
    /**
     * Модель телефона
     */
    private String model;
    /**
     * Вес телефона
     */
    private int weight;

    /**
     * Пустой конструктор
     */
    public Phone() {
    }

    /**
     * Конструктор с номером и моделью
     */
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    /**
     * Конструктор с номером, моделью и весом
     */
    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    /**
     * Геттер, возвращающий номер телефона
     */
    public int getNumber() {
        return number;
    }

    /**
     * Сеттер, позволяющий присваивать новый номер
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Геттер, возвращающий модель
     */
    public String getModel() {
        return model;
    }

    /**
     * Сеттер, позволяющий присваивать новую модель
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Геттер, возвращающий вес
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Сеттер, позволяющий присваивать новый вес
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Метод для вывода информации о звонке, принимающий имя звонящего
     */
    public void receiveCall(String name) {
        System.out.println("Звонит " + "{" + name + "}");
    }

    /**
     * Перегруженный метод для вывода информации о звонке, принимающий имя звонящего и номер, с которого звонят
     */
    public void receiveCall(String name, int number) {
        System.out.println("Вам звонит " + "{" + name + "}" + " с номера: " + number);
    }

    /**
     * Метод для вывода информации о номерах телефонов, на которые будет отправлено сообщение
     * Метод принимает разное количество номеров
     */
    public void sendMessage(int... numbers) {
        for (int number : numbers) {
            System.out.println("Сообщение отправлено на номер: " + number);
        }
    }

}
