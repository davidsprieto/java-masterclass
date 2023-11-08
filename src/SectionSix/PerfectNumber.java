package SectionSix;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 0;
            int count = 1;
            while (count <= number / 2) {
                if (number % count == 0) {
                    sum += count;
                    if ((sum == number) && (count <= number / 2)) {
                        return true;
                    }
                }
                count++;
            }
        }
        return false;
    }

}
