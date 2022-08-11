package lesson06;

public class CreditCard { // ДЗ (обязательная часть).
    int accountNumber;
    int amountOnAccount;

    public CreditCard(int accountNumber, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public void accrualOfAmountToCard(int amount) {
        amountOnAccount += amount;
    }

    public void withdrawalOfAmountFromCard(int amount) {
        amountOnAccount -= amount;
    }

    public void cardInformation() {
        System.out.println("Информация по карте с номером счета: " + accountNumber + "\n" + "Текущая сумма на счете - " + amountOnAccount);
    }

}
