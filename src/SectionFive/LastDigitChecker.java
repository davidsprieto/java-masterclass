package SectionFive;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int num1Last = lastNumber(num1);
            int num2Last = lastNumber(num2);
            int num3Last = lastNumber(num3);
            return ((num1Last == num2Last) || (num1Last == num3Last) || (num2Last == num3Last));
        }
        return false;
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static int lastNumber(int num) {
        return num % 10;
    }

}
