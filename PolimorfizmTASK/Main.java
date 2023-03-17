import deals.Expenditure;
import deals.Sale;
import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;
import deals.Deal;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company("Yandex", new TaxDebit());
        Company company2 = new Company("MTS", new TaxDebitMinusCredit());

        company1.shiftMoney(1000);
        company1.shiftMoney(-100);

        company2.shiftMoney(1000);
        company2.shiftMoney(-100);

        System.out.println();
        System.out.println("---- Налоги компании ----");
        company1.payTaxes();
        company2.payTaxes();

        Deal[] deals = {
                new Sale("Носки", 1500),
                new Expenditure("Штаны", 2000)
        };
        System.out.println();
        System.out.println("---- Сделки ----");
        for (Deal item : deals) {
            System.out.println(item.getComment());
        }

        System.out.println();
        System.out.println("---- Налоги за сделки ----");
        company1.applyDeals(deals);
        company2.applyDeals(deals);
    }
}

