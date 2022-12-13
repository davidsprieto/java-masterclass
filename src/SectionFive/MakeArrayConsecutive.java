package SectionFive;

public class MakeArrayConsecutive {

    public static void main(String[] args) {
        int[] a = {8, 1, 0, 4, 7};
        int[] a1 = sort(a);
        int a2 = missing(a1);
        System.out.println(a2);
    }

    // This function sorts an array in ascending order without using Arrays.sort()
    public static int[] sort(int[] statues) {
        int temp;
        for (int i = 1; i < statues.length; i++) {
            for (int j = 0; j < statues.length; j++) {
                temp = statues[i];
                if (temp < statues[j]) {
                    statues[i] = statues[j];
                    statues[j] = temp;
                }
            }
        }
        return statues;
    }

    // This function determines the amount of numbers missing in the ascending order (i.e - if the number at array[0] is 1, and the number at array[1] is 3, the number 2 is missing so variable 'needed' will increment by 1)
    public static int missing(int[] statues) {
        int count = 1;
        int needed = 0;
        for (int i = 0; i < statues.length && count < statues.length; i++) {
            if (statues[i] != statues[count] + 1) {
                needed += statues[count] - statues[i] - 1;
            }
            count++;
        }
        return needed;
    }

}
