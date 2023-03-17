package accounts;

public abstract class Account implements Operations{
    private long balance = 0;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long amount) {
        this.balance += amount;
    }
}
