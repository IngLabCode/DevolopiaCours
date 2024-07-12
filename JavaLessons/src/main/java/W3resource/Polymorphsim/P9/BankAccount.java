package W3resource.Polymorphsim.P9;

public class BankAccount {
    private int month;
    private int credit;
    private int quantity;

    public BankAccount(int month, int credit, int quantity) {
        this.month = month;
        this.quantity = quantity;
        this.credit = credit;

    }

    public int getMonth() {
        return month;
    }

    public int getCredit() {
        return credit;

    }

    public int getQuantity() {
        return quantity;
    }

    public int deposit() {
return 0;
    }

    public void withdraw() {

    }
}
