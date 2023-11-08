package SectionSix;

public class Sum3And5 {

    public static void main(String[] args) {
        int sum = 0, count = 0;

        System.out.print("First 5 numbers from 1 to 1000 that are divisible by 3 and 5 are: ");
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.print(i);
                if (count == 5) {
                    break;
                } else {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("\nThe sum of those numbers is: " + sum);
    }

}
