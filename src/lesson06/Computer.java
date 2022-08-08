package lesson06;

public class Computer { // ДЗ (необязательная часть #1).
    int price;
    String model;
    RAM memory;
    HDD hardDisk;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        memory = new RAM();
        hardDisk = new HDD();
    }

    public Computer(int price, String model, RAM memory, HDD hardDisk) {
        this.price = price;
        this.model = model;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public void computerInfo() {
        System.out.println("Информация по компьютеру:\n" + "Модель компьютера - " + model + "\n" +
                "Стоимость - " + price + "$" + "\n" +
                "Марка и объем ОЗУ - " + memory.ramInfo() + "\n" +
                "Марка, объем и тип жесткого диска - " + hardDisk.hddInfo());
    }

}
