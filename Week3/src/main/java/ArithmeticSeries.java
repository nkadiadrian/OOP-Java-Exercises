public class ArithmeticSeries {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int counter = 1;
        int sum = 0;
        while (counter <= i) {
            sum += counter;
            counter ++;
        }
        System.out.println(sum);
    }
}
