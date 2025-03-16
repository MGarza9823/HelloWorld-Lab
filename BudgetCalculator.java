import java.util.Scanner;

public class BudgetCalculator
{
    public static void main(String [] angs)
    {
        Scanner kb = new Scanner(System.in);

        final double SALARY=3000.0;
        final double SAVINGS_PERCENT=0.20;
        final double RENT_PERCENT=0.30;
        final double GROCERIES_PERCENT=0.15;
        final double ENTERTAINMENT_PERCENT=0.10;

        System.out.print("Monthly Salary: $");
        double monthlySalary = kb.nextDouble();
        double savedAmount = SALARY * SAVINGS_PERCENT;
        double rentAmount = SALARY * RENT_PERCENT;
        double groceriesAmount = SALARY * GROCERIES_PERCENT;
        double entertainmentAmount = SALARY * ENTERTAINMENT_PERCENT;
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        double remainingBalance = monthlySalary - totalExpenses;

        System.out.println("Amount Saved= $"+ savedAmount);
        System.out.println("Amount spent on rent= $"+ rentAmount);
        System.out.println("Amount spent on groceries= $"+ groceriesAmount);
        System.out.println("Amount spent on entertainment= $"+ SALARY * entertainmentAmount);
        System.out.println("Total expenses= $"+ totalExpenses);
        System.out.println("Remaining balance= $"+ remainingBalance);



        kb.close();
    }
    
}
