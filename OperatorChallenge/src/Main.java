public class Main {
    public static void main(String[] args) {
        double myDouble = 20.00d;
        double otherDouble = 80.00d;
        double sumDouble = (myDouble + otherDouble) * 100.00d;
        System.out.println("sumDouble = " + sumDouble);
        double remainderDouble = sumDouble % 40.00d;
        System.out.println("remainderDouble = " + remainderDouble);
        boolean myBoolean = (remainderDouble == 0) ? true : false;
        System.out.println("myBoolean = " + myBoolean);
        if (!myBoolean){
            System.out.println("Got some remainder");
        }
    }
}