package lesson07.Homework_Clinic;

/**
 * Класс, описывающий план лечения по заданному коду
 */

public class TreatmentPlan {
    /**
     * Номер кода
     */
    private int code;

    /**
     * Конструктор с номером кода
     */
    public TreatmentPlan(int code) {
        this.code = code;
    }

    /**
     * Геттер, возвращающий номер кода
     */
    public int getCode() {
        return code;
    }

    /**
     * Сеттер, позволяющий присваивать номер кода
     */
    public void setCode(int code) {
        this.code = code;
    }

}
