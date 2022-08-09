package lesson07.Homework_Clinic;

/**
 * Класс наследник, описывающий сущность Дантист
 */

public class Dentist extends Doctor {

    /**
     * Переопределенный метод для дантиста, который выводит информацию о лечении
     */
    @Override
    public void treat() {
        System.out.println("вылечит зуб");
    }
}
