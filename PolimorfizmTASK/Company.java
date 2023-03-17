import taxes.TaxSystem;
import deals.Deal;

public class Company {
    private String title;
    private int debit = 0;
    private int credit = 0;
    TaxSystem taxSystem;

    Company (String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            this.debit += amount;
        } else if (amount < 0) {
            this.credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }
    public void payTaxes() {
        System.out.format("Компания %s уплатила налог в размере: %d руб.",
                this.title, this.taxSystem.calcTaxFor(this.debit, this.credit));
        System.out.println();
        this.credit = 0;
        this.debit = 0;
    }

    public int calcIncome() {
        return this.debit - this.credit;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal item : deals) {
            this.debit += item.getDebitChange();
            this.credit += item.getCreditChange();
        }

        int income = calcIncome();

        payTaxes();

        return income;

    }
}
