package lesson07.Homework_Clinic;

/**
 * Создать программу для имитации работы клиники.
 * Пусть в клинике будет три врача: хирург, терапевт и дантист.
 * Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
 * Так же предусмотреть класс «Пациент» и класс «План лечения».
 * Создать объект класса «Пациент» и добавить пациенту план лечения.
 * Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
 * Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
 * Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
 * Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить
 */

public class MainClinic {

    public static void main(String[] args) {

        Doctor surgeon = new Surgeon(); // Создаем врача-хирурга
        Doctor dentist = new Dentist(); // Создаем врача-дантиста
        Doctor therapist = new Therapist(); // Создаем врача-терапевта
        Clinic clinic = new Clinic(surgeon, dentist, therapist); // Создаем клинику с тремя врачами

        Patient patient1 = new Patient("У меня болит зуб"); // Создаем первого пациента со своей проблемой
        TreatmentPlan treatmentPlan1 = new TreatmentPlan(2); // Создаем ему план лечения с кодом 2
        patient1.setTreatmentPlan(treatmentPlan1); // Присваиваем ему план лечения с кодом 2
        clinic.appointDoctorAndTreat(patient1); // Назначаем врача и лечим
        System.out.println();

        Patient patient2 = new Patient("У меня сломана нога");
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(1);
        patient2.setTreatmentPlan(treatmentPlan2);
        clinic.appointDoctorAndTreat(patient2);
        System.out.println();

        Patient patient3 = new Patient("У меня высокая температура");
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);
        patient3.setTreatmentPlan(treatmentPlan3);
        clinic.appointDoctorAndTreat(patient3);

    }
}
