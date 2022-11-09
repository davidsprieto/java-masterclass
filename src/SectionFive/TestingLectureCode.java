package SectionFive;

public class TestingLectureCode {

    public static void main(String[] args) {
        int number = 0;
        while (number <= 15) {
            number++;

            if (number <= 5) {
                System.out.println("Skipping number: " + number);
                continue;
            }

            System.out.println("Number = " + number);

            if (number == 15) {
                System.out.println("Breaking at: " + number);
                break;
            }
        }
    }

}
