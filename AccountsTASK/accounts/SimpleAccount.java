package accounts;

public class SimpleAccount extends Account implements Operations{

    public SimpleAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean add(long amount) {
        if (super.getBalance() >= 0) {
            super.setBalance(amount);
            return true;
        }

        return false;
    }

    @Override
    public boolean pay(long amount) {
        if ((super.getBalance() - amount) > 0) {
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
}
