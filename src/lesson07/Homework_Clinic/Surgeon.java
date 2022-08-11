package lesson07.Homework_Clinic;

/**
 * Класс наследник, описывающий сущность Хирург
 */

public class Surgeon extends Doctor {

    /**
     * Переопределенный метод для хирурга, который выводит информацию о лечении
     */
    @Override
    public void treat() {
        System.out.println("проведет операцию");
    }
}
