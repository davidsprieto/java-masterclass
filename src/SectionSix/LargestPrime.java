package SectionSix;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largest = 2;
        while (number > largest) {
            if (number % largest == 0) {
                number /= largest;
            } else {
                largest++;
            }
        }
        return largest;
    }

}
