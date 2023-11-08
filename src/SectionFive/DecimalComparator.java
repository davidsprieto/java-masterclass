package SectionFive;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces2(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.DOWN);
        if (df.format(num1).equals(df.format(num2)) ) {
            return true;
        } else return num1 == num2;
    }

    // OR:

    public static boolean areEqualByThreeDecimalPlaces2(double num1, double num2) {
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        num1 = (int) num1 * .001;
        num2 = (int) num2 * .001;

        return num1 == num2;
    }

}
