package SectionThree;

public class Main {

    public static void main(String[] args) {

        /*
        // 08/11/22
        // Byte, Short, Integer, and Long Data Types

        // BYTE - 8 BITS
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);


        // SHORT - 16 BITS
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        short bigShortLiteralValue = 32767;


        // INTEGER - 32 BITS
        int myIntValue = 10000;
        int  myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;


        // LONG - 64 BITS
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;

        // CASTING
        // Java assumes value in parentheses to be an int data type so (cast) to another data type if necessary/needed.
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewSHortValue = (short) (myMinShortValue / 2);

        // CHALLENGE
        byte byteValue = 24;
        short shortValue = 24000;
        int intValue = 240000;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
         */

        /*
        // 08/13/22
        // Float and Double Data Types

        // FLOATS - 32 BITS
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        // DOUBLES - 64 BITS
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // CHALLENGE
        double pounds = 100d;
        double poundsToKilos = pounds * 0.45359237d;
        System.out.println("100 pounds to kilograms = " + poundsToKilos);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
         */

        /*
        // 08/16/22
        // Char & Boolean Data Types

        // Char
        char myChar = 'D';
        char myUnicode = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myCopyrightChar);

        // Boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        // String Data Type
        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is now equal to: " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to: " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to: " + lastString);
         */

        /*
        // Operators, Operands, and Expressions
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);
        */

        // if-then statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And aliens are cool.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 79;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than the second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        // Ternary Operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true.");
        }

        // OPERATOR CHALLENGE
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myDoublesTotal = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("myDoublesTotal = " + myDoublesTotal);
        double myRemainder = (myDoublesTotal % 40.00d);
        System.out.println("myRemainder = " + myRemainder);
        boolean isZero = myRemainder == 0;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
