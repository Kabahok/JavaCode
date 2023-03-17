import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Здравствуйте! Мы можем подобрать оптимальную УНС для вас, для этого следуйте инструкциями ниже)");
      System.out.println("------------------------------");
      
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать ситему налогооблажения");
            String input = sc.nextLine();

            if (input.equals("end")) {
                System.out.println("------------------------------");
                System.out.println("Спасибо, что воспользовались нашей системой! Всего доброго!");
              System.out.println("------------------------------");
                break;
            } else {
                int operation = Integer.parseInt(input);

                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода:");
                        int valueIncome = Integer.parseInt(sc.nextLine());
                        CalculationProcess.addIncome(valueIncome);
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода:");
                        int valueExpenses = Integer.parseInt(sc.nextLine());
                        CalculationProcess.addExpenses(valueExpenses);
                        break;
                    case 3:
                        ChoiceTaxation.choiceTaxation();
                        break;
                    default:
                        System.out.println("Такой операции нет :(");
                }
            }
        }
    }
}
