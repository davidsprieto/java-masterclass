package SectionFive;

public class IsPrime {

    public static void main(String[] args) {
        printCount(100);
    }

    public static void printCount(int max) {
        int count = 0;

        for (int i = 1; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("The number of prime numbers between 1 and " + max + " is " + count);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
