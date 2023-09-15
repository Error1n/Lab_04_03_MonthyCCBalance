public class Main {
    public static void main(String[] args)
    {
        int creditCardBalance = 5000;
        double interest = creditCardBalance * .17;
        double oneMonthBal = creditCardBalance + interest;
        double compoundedInterest = oneMonthBal * .17;
        double twoMonthBal = compoundedInterest + oneMonthBal;
        System.out.println("Your balance due after one month is " + oneMonthBal);
        System.out.println("Your balance due after two months is " + twoMonthBal);
    }
}