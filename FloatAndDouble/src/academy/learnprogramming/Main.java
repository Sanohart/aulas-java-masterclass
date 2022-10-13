package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Float type----------------------");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum: " + myMinFloatValue);
        System.out.println("Float maximum: " + myMaxFloatValue);

        System.out.println("----------------Double type----------------------");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum: " + myMinDoubleValue);
        System.out.println("Double maximum: " + myMaxDoubleValue);

        System.out.println("----------------Practice----------------------");
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; //5.25f
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        System.out.println("----------------Challenge----------------------");
        double myWeight = 200d;
        double myConvertedWeight = myWeight * 0.45359237d;
        System.out.println("Converted kilograms= " + myConvertedWeight);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}