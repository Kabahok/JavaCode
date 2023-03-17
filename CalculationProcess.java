public class CalculationProcess {
    static final int PERCENT_INCOME = 6;
    static final int PERCENT_DIFFERENCE = 15;

    static int earnings = 0;
    static int spendings = 0;


    public static void addIncome(int sumIncome) {
        earnings += sumIncome;
    }

    public static void addExpenses(int sumExpenses) {
        spendings += sumExpenses;
    }

    public static int taxIncome() {
        return (earnings * PERCENT_INCOME / 100);
    }

    public static int taxDifference() {
        int resTaxDifference = (earnings - spendings) * PERCENT_DIFFERENCE / 100;
        return Math.max(resTaxDifference, 0);
    }

    public static int calculationEconomy(int costIncome, int costDifference) {
        return Math.abs(costDifference - costIncome);
    }

}
