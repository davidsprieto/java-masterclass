package SectionSix;

import java.util.HashMap;
import java.util.Map;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(4);
        printNumberInWordRefactor(4);
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    // REFACTOR
    public static void printNumberInWordRefactor(int number) {
        Map<Integer, String> hash = new HashMap<>();
        hash.put(0, "ZERO");
        hash.put(1, "ONE");
        hash.put(2, "TWO");
        hash.put(3, "THREE");
        hash.put(4, "FOUR");
        hash.put(5, "FIVE");
        hash.put(6, "SIX");
        hash.put(7, "SEVEN");
        hash.put(8, "EIGHT");
        hash.put(9, "NINE");

        System.out.println(hash.getOrDefault(number, "OTHER"));
    }


}
