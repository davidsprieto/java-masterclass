package SectionFive;

public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        int[] a = {1, 1};
        System.out.println(isSequential(a));
    }

    // This function checks if any number can be removed from an array and allow the existing numbers in the array to be in ascending order.
    public static boolean isSequential(int[] sequence) {
        if (sequence.length <= 2) {
            return true;
        }

        int[] array = new int[sequence.length - 1];
        boolean isSequential = false;
        int iterations = 0;
        int count = 0;
        int c = 0;
        int temp;

        while (iterations != sequence.length) {
            for (int j = 0; j < sequence.length; j++) {
                if (j == count) {
                    continue;
                }
                array[c] = sequence[j];
                c++;
            }
            c = 0;
            count += 1;

            for (int i = 1; i < array.length; i++) {
                temp = i - 1;
                isSequential = array[temp] < array[i];
                if (!isSequential) {
                    break;
                }
            }
            if (isSequential) {
                return true;
            }
            iterations++;
        }
        return false;
    }

}
