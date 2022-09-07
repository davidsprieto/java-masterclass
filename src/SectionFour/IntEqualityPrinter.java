package SectionFour;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int firstInteger, int secondInteger, int thirdInteger) {
        if (firstInteger < 0 || secondInteger < 0 || thirdInteger < 0) {
            System.out.println("Invalid Value");
        } else if (firstInteger == secondInteger && secondInteger == thirdInteger) {
            System.out.println("All numbers are equal");
        } else if (firstInteger != secondInteger && secondInteger != thirdInteger && firstInteger != thirdInteger) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
