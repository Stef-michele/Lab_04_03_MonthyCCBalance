public class Main
{
    public static void main(String[] args)
    {   //declaring variables
        double startingBalance = 5000.00;
        double interestRate = .17;
        double firstMonthBalance = 0;
        double secondMonthBalance = 0;
        //solve for interest
        firstMonthBalance = startingBalance * (1 + interestRate);
        secondMonthBalance = firstMonthBalance * (1 + interestRate);
        //output user's balance after first, then second month
        System.out.println("Your balance with interest after one month is $" + firstMonthBalance);
        System.out.println("Your balance with interest after two months is $" + secondMonthBalance);
    }
}