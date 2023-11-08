package SectionSix;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int num1First = num1 / 10;
            int num1Last = num1 % 10;
            int num2First = num2 / 10;
            int num2Last = num2 % 10;
            return ((num1First == num2First || num1First == num2Last) || (num1Last == num2First || num1Last == num2Last));
        }
        return false;
    }

}
