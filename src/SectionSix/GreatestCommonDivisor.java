package SectionSix;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int lowest;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            lowest = Math.min(first, second);
        }

        int count = 1;
        int greatest = 1;

        while (count <= lowest) {
            count++;
            if (first % count == 0 && second % count == 0) {
                greatest = count;
            }
        }
        return greatest;
    }

}
