package lesson07.Homework_Clinic;

/**
 * Класс родитель, описывающий сущность Доктор
 */

public class Doctor {
    /**
     * Название специализации врача
     */
    private String nameSpecialization;

    /**
     * Геттер, возвращающий название специализации
     */
    public String getNameSpecialization() {
        return nameSpecialization;
    }

    /**
     * Сеттер, позволяющий присваивать название специализации
     */
    public void setNameSpecialization(String nameSpecialization) {
        this.nameSpecialization = nameSpecialization;
    }

    /**
     * Метод, который выводит информацию о лечении
     */
    public void treat() {
        System.out.println("Доктор лечит...");
    }

}
