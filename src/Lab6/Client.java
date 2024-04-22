package Lab6;

public class Client extends Person implements BankOperations {
    private String nameBank;
    private double balance;

    public Client(String firstName, String lastName, String nameBank) {
        super(firstName, lastName);
        this.nameBank = nameBank;
        this.balance = 0.0;
    }

    @Override
    protected void printInfo() {
        System.out.println(String.format("Клиент %s %s, банк: %s", firstName, lastName, nameBank));
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void refil(double amount) {
        balance += amount;
        System.out.println(String.format("Пополнение счета на сумму %d выполнено", amount));
    }

    @Override
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(String.format("Снятие со счета суммы %d выполнено", amount));
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }
}
