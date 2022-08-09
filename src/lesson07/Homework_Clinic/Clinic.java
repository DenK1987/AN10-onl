package lesson07.Homework_Clinic;

/**
 * Класс, описывающий работу клиники
 */

public class Clinic {
    /**
     * Врач-хирург
     */
    private Doctor surgeon;
    /**
     * Врач-дантист
     */
    private Doctor dentist;
    /**
     * Врач-терапевт
     */
    private Doctor therapist;

    /**
     * Конструктор для создания клиники с тремя врачами
     */
    public Clinic(Doctor surgeon, Doctor dentist, Doctor therapist) {
        this.surgeon = surgeon;
        this.dentist = dentist;
        this.therapist = therapist;
    }

    public Doctor getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(Doctor surgeon) {
        this.surgeon = surgeon;
    }

    public Doctor getDentist() {
        return dentist;
    }

    public void setDentist(Doctor dentist) {
        this.dentist = dentist;
    }

    public Doctor getTherapist() {
        return therapist;
    }

    public void setTherapist(Doctor therapist) {
        this.therapist = therapist;
    }

    /**
     * Метод, который согласно плану лечения назначает врача для пациента и лечит
     */
    public void appointDoctorAndTreat(Patient patient) {
        if (patient.getTreatmentPlan().getCode() == 1) {
            surgeon.setNameSpecialization("хирург");
            System.out.print("Вам назначен - " + surgeon.getNameSpecialization() + ", который ");
            surgeon.treat();
        } else if (patient.getTreatmentPlan().getCode() == 2) {
            dentist.setNameSpecialization("дантист");
            System.out.print("Вам назначен - " + dentist.getNameSpecialization() + ", который ");
            dentist.treat();
        } else {
            therapist.setNameSpecialization("терапевт");
            System.out.print("Вам назначен - " + therapist.getNameSpecialization() + ", который ");
            therapist.treat();
        }
    }

}
