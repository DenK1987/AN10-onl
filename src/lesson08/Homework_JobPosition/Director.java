package lesson08.Homework_JobPosition;

public class Director implements Printable {
    private String surname;

    public Director(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void printJobPosition() {
        System.out.println("директор");
    }

}
