package SectionFour;

public class Main {

    // main method that runs the program
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

        // Call the method, insert values, and print out the result:
        System.out.println(calculateScore(true, 8500, 15, 100));

        // OR Save the return value from the method call with the inserted values in a variable then pass in the variable name to System.out.println:
        int highScore = calculateScore(true, 8500, 15, 100);
        System.out.println(highScore);

        // Could also create variables and pass the values in when calling the method:
        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

        System.out.println(calculateScore(gameOver, score, levelsCompleted, bonus));
         */

        int highScorePosition = calculateHighScorePosition(1500);
        System.out.println(displayHighScorePosition("David", highScorePosition));

        highScorePosition = calculateHighScorePosition(900);
        System.out.println(displayHighScorePosition("Tim", highScorePosition));

        highScorePosition = calculateHighScorePosition(400);
        System.out.println(displayHighScorePosition("Bob", highScorePosition));

        highScorePosition = calculateHighScorePosition(50);
        System.out.println(displayHighScorePosition("Bill", highScorePosition));

        // OR:
        String davidScore = displayHighScorePosition("David", calculateHighScorePosition(1500));
        System.out.println(davidScore);

        String timScore = displayHighScorePosition("Tim", calculateHighScorePosition(900));
        System.out.println(timScore);

        String bobScore = displayHighScorePosition("Bob", calculateHighScorePosition(400));
        System.out.println(bobScore);

        String billScore = displayHighScorePosition("Bill", calculateHighScorePosition(50));
        System.out.println(billScore);

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

    // 08/31/22
    // Methods - Continued
    // Challenge:
    public static String displayHighScorePosition(String playerName, int highScorePosition) {
        return "Player: " + playerName + ", managed to get into " + highScorePosition + " position on the high score table.";
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

}
