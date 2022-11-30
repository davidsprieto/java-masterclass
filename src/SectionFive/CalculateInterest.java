package SectionFive;

import java.text.DecimalFormat;

public class CalculateInterest {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        printInterest(2.0,10000.0, 8.0);
    }

    public static void printInterest(double minRate, double amount, double maxRate) {
        for (double i = maxRate; i >= minRate; i--) {
            System.out.println("$" + df.format(amount) + " at a " + df.format(i) + "% interest rate is " + calculateInterest(amount, i));
        }
    }

    public static String calculateInterest(double amount, double interestRate) {
        return df.format(amount * (interestRate/100));
    }

}