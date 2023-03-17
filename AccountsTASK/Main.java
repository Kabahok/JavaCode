import accounts.Account;
import accounts.CreditAccount;
import accounts.SimpleAccount;

public class Main {

    private static final String SUCCESS = "Операция прошла успешно\n";
    private static final String ERROR = "Невозможно выполнить операцию\n";
    private static final String CHECK_BALANCE = "Ваш баланс равен: %d\n";
    private static int cntOperation = 0;

    public static void main(String[] args) {
        Account[] accounts = {
                new SimpleAccount(10000),
                new CreditAccount(10000, 5000)
        };
        System.out.println();
        // Операции с обычным счетом
        operation(accounts[0].add(1500), accounts[0]);
        operation(accounts[0].pay(15000), accounts[0]);
        operation(accounts[0].add(15000), accounts[0]);
        // Перевод на кредитный счет невозможен
        operation(accounts[0].transfer(accounts[1], 15000), accounts[0]);

        // Операциия с кредитным счетом
        operation(accounts[1].add(1500), accounts[1]);
        operation(accounts[1].pay(5000), accounts[1]);
        // Перевод на обычный счет
        operation(accounts[1].transfer(accounts[0], 10000), accounts[1]);
        // Проверяем баланс обычного счета
        System.out.format("Ваш баланс равен: %d\n", accounts[0].getBalance());


    }

    public static void operation(boolean flag, Account item) {
        cntOperation += 1;
        System.out.format("-------- Операция %d --------\n", cntOperation);
        if (flag) {
            System.out.format(SUCCESS);
            System.out.format(CHECK_BALANCE, item.getBalance());
        } else {
            System.out.format(ERROR);
        }
        System.out.println();
    }
}

