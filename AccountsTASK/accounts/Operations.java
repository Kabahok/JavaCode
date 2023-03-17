package accounts;

public interface Operations {
    boolean add(long amount);
    boolean pay(long amount);
    boolean transfer(Account account, long amount);
}
