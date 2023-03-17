package deals;

public class Expenditure extends Deal{
    private static final String COMMENT_FORM = "Покупка %s на %d руб.";

    public Expenditure(String name, int creditChange) {
        super(String.format(COMMENT_FORM, name, creditChange), 0, creditChange);
    }
}
