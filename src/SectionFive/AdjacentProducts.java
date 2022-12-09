package SectionFive;

public class AdjacentProducts {

    public static void main(String[] args) {
        int[] a = {3, 6, -2, -5, 7, 3};
        int a1 = solution(a);
        System.out.println(a1);
    }

    public static int solution(int[] inputArray) {
        int temp;
        int product = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i - 1; j < i; j++) {
                temp = inputArray[i] * inputArray[j];
                if (temp > product) {
                    product = temp;
                    break;
                }
            }
        }
        return product;
    }

}
