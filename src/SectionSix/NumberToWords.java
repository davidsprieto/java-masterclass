package SectionSix;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(100));
        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(100100));
    }

    public static String numberToWords(int number) {
        int count;
        int digitCount;
        String word = "";
        if (number < 0) {
            System.out.print("Invalid Value");
        } else {
            digitCount = getDigitCount(number);
            number = reverse(number);
            count = 0;
            while (number > 0) {
                int last = number % 10;
                switch (last) {
                    case 0 -> word = word.concat("zero ");
                    case 1 -> word = word.concat("one ");
                    case 2 -> word = word.concat("two ");
                    case 3 -> word = word.concat("three ");
                    case 4 -> word = word.concat("four ");
                    case 5 -> word = word.concat("five ");
                    case 6 -> word = word.concat("six ");
                    case 7 -> word = word.concat("seven ");
                    case 8 -> word = word.concat("eight ");
                    case 9 -> word = word.concat("nine ");
                }
                number /= 10;
                count++;
            }
            int difference = digitCount - count;
            if (difference > 0) {
                for (int i = difference; i > 0; i--) {
                    word = word.concat("zero ");
                }
            }
        }
        return word;
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse + number % 10;
            number /= 10;
            if (number != 0) {
                reverse *= 10;
            }
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int count = 0;
            boolean digits = true;
            while (digits) {
                count++;
                number /= 10;
                if (number == 0) {
                    digits = false;
                }
            }
            return count;
        }
    }

}
