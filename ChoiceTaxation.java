public class ChoiceTaxation {
    public static void choiceTaxation() {
        int economy = CalculationProcess.calculationEconomy(CalculationProcess.taxIncome(), CalculationProcess.taxDifference());
        int income = CalculationProcess.taxIncome();
        int defference = CalculationProcess.taxDifference();
        if (income > defference) {
            reply(defference, income, economy, true);
        } else if (income < defference) {
            reply(income, defference, economy, true);
        } else {
            reply(income, defference, economy, false);
        }
    }

    public static void reply(int tax, int taxTwo, int taxEconomy, boolean flag) {
        if (flag) {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + tax + " рублей");
            System.out.println("Налог на другой системе: " + taxTwo + " рублей");
            System.out.println("Экономия: " + taxEconomy + " рублей");
        } else {
            System.out.println("Вы можете выбрать выбрать любую систему налогообложения");
            System.out.println("Ваш налог в данном случае составит: " + tax + " рублей");
        }
    }

}
