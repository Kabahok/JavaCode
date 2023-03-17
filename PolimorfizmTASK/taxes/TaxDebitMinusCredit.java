package taxes;

public class TaxDebitMinusCredit extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit - credit) < 0 ? 0 : (15 * (debit - credit)) / 100;
    }

}
