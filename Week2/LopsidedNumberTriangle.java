public class LopsidedNumberTriangle {
    public static void main(String[] args) {
        for (int count = 1; count <= 9; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print(count);
            }
            System.out.print("\n");
        }
    }
}