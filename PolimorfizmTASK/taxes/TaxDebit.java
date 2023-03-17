package taxes;

public class TaxDebit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (6 * debit) / 100;
    }
}
