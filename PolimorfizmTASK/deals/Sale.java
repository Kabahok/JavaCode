package deals;

public class Sale extends Deal{
    private static final String COMMENT_FORM = "Продажа %s на %d руб.";

    public Sale(String name, int debitChange) {
        super(String.format(COMMENT_FORM, name, debitChange), debitChange, 0);
    }
}
