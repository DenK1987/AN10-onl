package lesson07.Homework_Clinic;

/**
 * Класс наследник, описывающий сущность Терапевт
 */

public class Therapist extends Doctor {

    /**
     * Переопределенный метод для терапевта, который выводит информацию о лечении
     */
    @Override
    public void treat() {
        System.out.println("проведет первичный осмотр и назначит дальнейшее лечение");
    }
}
