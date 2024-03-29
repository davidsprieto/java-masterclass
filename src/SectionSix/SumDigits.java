package SectionSix;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(10));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        } else {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }

}
