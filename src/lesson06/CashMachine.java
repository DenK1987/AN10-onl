package lesson06;

public class CashMachine { // ДЗ (необязательная часть #2).
    int amountBanknote20;
    int amountBanknote50;
    int amountBanknote100;

    public CashMachine(int amountBanknote20, int amountBanknote50, int amountBanknote100) {
        this.amountBanknote20 = amountBanknote20;
        this.amountBanknote50 = amountBanknote50;
        this.amountBanknote100 = amountBanknote100;
    }

    public int sumMoneyInCashMachine() {
        return amountBanknote20 * 20 + amountBanknote50 * 50 + amountBanknote100 * 100;
    }

    public void infoCashMachine() {
        System.out.println("Количество купюр в банкомате номиналом 20: " + amountBanknote20 + "\n" +
                "Количество купюр в банкомате номиналом 50: " + amountBanknote50 + "\n" +
                "Количество купюр в банкомате номиналом 100: " + amountBanknote100 + "\n" +
                "Сумма наличных в банкомате: " + sumMoneyInCashMachine());
    }

    public void addMoneyToCashMachine(Money money) {
        if (money.sumMoney() > 0) {
            amountBanknote20 += money.amountBanknote20;
            amountBanknote50 += money.amountBanknote50;
            amountBanknote100 += money.amountBanknote100;
            System.out.println("Сумма наличных, вносимых в банкомат: " + money.sumMoney() + "\n" +
                    "Количество купюр номиналом 20 в банкомате после добавления: " + amountBanknote20 + "\n" +
                    "Количество купюр номиналом 50 в банкомате после добавления: " + amountBanknote50 + "\n" +
                    "Количество купюр номиналом 100 в банкомате после добавления: " + amountBanknote100 + "\n" +
                    "Сумма наличных в банкомате после добавления: " + sumMoneyInCashMachine());
        } else {
            System.out.println("Вы не добавили деньги в банкомат");
        }
    }

    public boolean checkPossibilityWithdrawal(Money money) {
        if (money.sumMoney() > sumMoneyInCashMachine() ||
                amountBanknote20 < money.amountBanknote20 ||
                amountBanknote50 < money.amountBanknote50 ||
                amountBanknote100 < money.amountBanknote100) {
            return false;
        } else {
            return true;
        }
    }

    public void withdrawalMoneyFromCashMachine(Money money) {
        if (checkPossibilityWithdrawal(money)) {
            System.out.println("Сумма наличных в банкомате: " + sumMoneyInCashMachine() + "\n" +
                    "Сумма снятия: " + money.sumMoney() + "\n" +
                    "Количеством купюр номиналом 20: " + money.amountBanknote20 + "\n" +
                    "Количеством купюр номиналом 50: " + money.amountBanknote50 + "\n" +
                    "Количеством купюр номиналом 100: " + money.amountBanknote100 + "\n" +
                    "Сумма наличных в банкомате после снятия: " + (sumMoneyInCashMachine() - money.sumMoney()));
        } else {
            System.out.println("Выполнение операции невозможно");
        }
    }

}
