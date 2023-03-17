package deals;

public class Deal {
    private String comment;
    private int creditChange;
    private int debitChange;

    public Deal (String comment, int debitChange, int creditChange) {
        this.creditChange = creditChange;
        this.comment = comment;
        this.debitChange = debitChange;
    }

    public int getCreditChange() {
        return this.creditChange;
    }

    public int getDebitChange() {
        return this.debitChange;
    }

    public String getComment() {
        return this.comment;
    }
}
