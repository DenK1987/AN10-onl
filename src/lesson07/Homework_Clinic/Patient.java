package lesson07.Homework_Clinic;

/**
 * Класс, описывающий сущность Пациент
 */

public class Patient {
    /**
     * Название проблемы, с которой столкнулся пациент
     */
    private String problem;
    /**
     * План лечения, по которому назначат врача и лечение
     */
    private TreatmentPlan treatmentPlan;

    /**
     * Конструктор с названием проблемы
     */
    public Patient(String problem) {
        this.problem = problem;
    }

    /**
     * Геттер, возвращающий название проблемы
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Сеттер, позволяющий присваивать название проблемы
     */
    public void setProblem(String problem) {
        this.problem = problem;
    }

    /**
     * Геттер, возвращающий план лечения
     */
    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    /**
     * Сеттер, позволяющий присваивать план лечения
     */
    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

}
