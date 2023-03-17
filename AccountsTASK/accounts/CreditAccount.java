package accounts;

public class CreditAccount extends Account implements Operations {
    private long balanceLimit;



    public CreditAccount(long balance, long balanceLimit) {
        super(balance);
        this.balanceLimit = balanceLimit;
    }

    @Override
    public boolean add(long amount) {
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (Math.abs(super.getBalance() - amount) <= balanceLimit) {
            super.setBalance(-amount);
            return true;
        }

        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (account.add(amount)) {
            if (pay(amount)) {
                return true;
            }
            account.pay(-amount);
            return false;
        }

        return false;
    }

    public long getBalanceLimit() {
        return this.balanceLimit;
    }

    public void setBalanceLimit(long balanceLimit) {
        this.balanceLimit = balanceLimit;
    }
}
