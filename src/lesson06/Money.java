package lesson06;

public class Money { // ДЗ (необязательная часть #2).
    int amountBanknote20;
    int amountBanknote50;
    int amountBanknote100;

    public Money(int amountBanknote20, int amountBanknote50, int amountBanknote100) {
        this.amountBanknote20 = amountBanknote20;
        this.amountBanknote50 = amountBanknote50;
        this.amountBanknote100 = amountBanknote100;
    }

    public int sumMoney() {
        return amountBanknote20 * 20 + amountBanknote50 * 50 + amountBanknote100 * 100;
    }

}
