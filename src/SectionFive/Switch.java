package SectionFive;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter a letter from A-Z: ");
        String switchValue = kbd.nextLine();

        switch (switchValue.toLowerCase()) {
            case "a":
                System.out.println("Input was an 'a'.");
                break;
            case "b":
                System.out.println("Input was a 'b'.");
                break;
            case "c":
                System.out.println("Input was a 'c'.");
                break;
            case "d":
                System.out.println("Input was a 'd'.");
                break;
            case "e":
                System.out.println("Input was an 'e'.");
                break;
            default:
                System.out.println("Input was not an 'a', 'b', 'c', 'd', or 'e'.");
        }

    }

}
