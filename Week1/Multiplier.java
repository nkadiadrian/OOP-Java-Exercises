public class Multiplier {
    public static void main (String[] args) {
        int myNumber1 = Integer.parseInt(args[0]);
        int myNumber2 = Integer.parseInt(args[1]);
        int myNumber3 = Integer.parseInt(args[2]);
        int product = myNumber1 * myNumber2 * myNumber3;
        System.out.println(args[0] + " * " + args[1] + " * " + args[2] + " = " + Integer.toString(product));
    }
}