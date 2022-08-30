package SectionFour;

public class Main {

    public static void main(String[] args) {

        /*
        // 08/23/22
        // Keywords and Expressions:
        // one mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344); // the expression is 'kilometers = (100 * 1.609344)' - the expression doesn't include the data type pr semicolon (variables, values, and operators make an expression).
        System.out.println(kilometers);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("'highScore == 50' is an expression."); // The string in the System.out.println is an expression.
        }

        // In the following code, write down which parts of the code that are expressions:
        int score = 100; // 'score = 100'
        if (score > 99) { // 'score > 99'
            System.out.println("You got the high score!"); // 'You got the high score!'
            score = 0; // 'score = 0'
        }

        // Statements:
        int myVariable = 50; // The statement is the whole line - 'int myVariable = 50;' is a statement.
        myVariable++;
        myVariable--;
        System.out.println(myVariable);
        System.out.println("This is a test.");
        System.out.println("This is" +
                " another test." +
                " And more.");

        int anotherVariable = 5;
        myVariable--;
        System.out.println("Another test."); // You can put many statements on one line however you should NOT do it.
         */

        /*
        // 08/30/22
        // Code Blocks and The If, Then, Else Control Statements:
        Scanner keyboard = new Scanner(System.in);

        boolean gameOver = true;
        int score;
        int levelsCompleted;

        System.out.print("Please enter your score: ");
        score = keyboard.nextInt();

        System.out.print("Please enter how many levels you completed: ");
        levelsCompleted = keyboard.nextInt();

        int bonus = 100 * levelsCompleted;
        int finalScore = score + bonus;

        if (gameOver) {
            System.out.println("Your final score was: " + finalScore);
            if (finalScore >= 10000) {
                System.out.println("That's an impressive score!");
            } else if (finalScore >= 5000 && finalScore < 10000) {
                System.out.println("That's a pretty good score.");
            } else {
                System.out.println("Not a bad score, you could do better though...");
            }
        }
         */

        // Call the method, insert values, and print out the result:
        System.out.println(calculateScore(true, 8500, 15, 100));

        // OR Save the return value from the method call with the inserted values in a variable then pass in the variable name to System.out.println:
        int finalScore = calculateScore(true, 8500, 15, 100);
        System.out.println(finalScore);
    }

    // 08/30/22
    // Methods:
    public static int calculateScore(boolean gameOver, int score, int levelsCompleted, int bonus) {
        if (gameOver) {
            bonus = bonus * levelsCompleted;
            int finalScore = score + bonus;
            return finalScore;
        }
        return -1;
    }

}
