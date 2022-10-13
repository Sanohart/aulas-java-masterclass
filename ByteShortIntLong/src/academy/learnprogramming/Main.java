package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================Integer variable====================");
        //Integer variable
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);

        //Busting variable values "resets" the count
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //Underflow
        //int myMaxIntTest = 2147483648; //Gives an error

        //Hint: Underline on integers are semantic
        int test = 1_000_000 + 2_000_000;
        System.out.println(test);

        System.out.println("===================Byte variable====================");
        //Byte variable
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        System.out.println("===================Short variable====================");
        //Short variable
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);

        System.out.println("===================Long variable====================");
        //Long variable ATTENTION
        long myLongValue = 100L; //Long values need an "L"
        //Long variable
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        System.out.println("===================Casting====================");
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("===================Challenge 01====================");
        byte myByte = 12;
        short myShort = 38;
        int myInt = 124;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
        //short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
    }
}