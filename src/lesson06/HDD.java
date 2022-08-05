package lesson06;

public class HDD { // ДЗ (необязательная часть #1).
    String brand;
    int capacity;
    String type;

    public HDD() {
    }

    public HDD(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    public String hddInfo() {
        String description;
        if (brand == null && capacity == 0 && type == null) {
            description = "информация отсутствует";
        } else {
            description = brand + ", " + capacity + "Gb, " + type;
        }
        return description;
    }

}
