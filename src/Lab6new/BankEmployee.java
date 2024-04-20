package Lab6new;

public class BankEmployee extends Person implements BankOperations {
    private String nameBank;

    public BankEmployee(String firstName, String lastName, String nameBank) {
        super(firstName, lastName);
        this.nameBank = nameBank;
    }

    @Override
    protected void printInfo() {
        System.out.println(String.format("Работник банка %s %s, банк: %s", firstName, lastName, nameBank));
    }

    @Override
    public double checkBalance() {
        System.out.println(String.format("Работник %s %s банка %s проверил баланс", firstName, lastName, nameBank));
        return 0.0;
    }

    @Override
    public void refil(double amount) {
        System.out.println(String.format("Работник %s %s банка %s выполнил пополнение счета на сумму %d", firstName, lastName, nameBank, amount));
    }

    @Override
    public void withdrawal(double amount) {
        System.out.println(String.format("Работник %s %s банка %s выполнил вывод со счета на сумму %d", firstName, lastName, nameBank, amount));
    }
}
