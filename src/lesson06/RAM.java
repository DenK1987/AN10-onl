package lesson06;

public class RAM { // ДЗ (необязательная часть #1).
    String brand;
    int capacity;

    public RAM() {
    }

    public RAM(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String ramInfo() {
        String description;
        if (brand == null && capacity == 0) {
            description = "информация отсутствует";
        } else {
            description = brand + ", " + capacity + "Gb";
        }
        return description;
    }

}
