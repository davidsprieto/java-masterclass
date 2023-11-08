package SectionFive;

public class MethodOverloading {

    // 09/02/22
    // Method Overloading
    public static void main(String[] args) {
        int myScore = calculateScore("David", 500);
        System.out.println("My score * 1000 is: " + myScore);

        int newScore = calculateScore(75);
        System.out.println("Unnamed player's score * 1000 is: " + newScore);

        int score = calculateScore();
        System.out.println("Score is: " + score);

        // Testing Challenge:
        calcFeetAndInchesToCentimeters(4, 5);

        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored: " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // Challenge:
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        } else {
            double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
            System.out.println("There are " + centimeters + " centimeters in " + feet + " feet and " + inches + " inches.");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) (inches / 12);
            double remaining = (inches % 12);
            System.out.println("There are " + feet + " feet and " + remaining + " inches in " + inches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, remaining);
        }
    }

}
