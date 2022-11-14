package SectionFive;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (number != 0) {
            reverse = reverse + number % 10;
            number /= 10;
            if (number != 0) {
                reverse *= 10;
            }
        }
        return (original == reverse);
    }

}
