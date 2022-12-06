package SectionFive;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
            return;
        }
        for (int r = 0; r < number; r++) {
            for (int c = 0; c < number; c++) {
                if ((r == 0) || (r == number - 1) || (c == 0)
                    || (c == number -1) || (r == c) || r + c == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
