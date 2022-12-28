public class SquaresLoopRange {
    public static void main(String[] args) {
        int startNum = Integer.parseInt(args[0]);
        int stopNum  = Integer.parseInt(args[1]);
        for (int count = startNum; count <= stopNum; count++) {
            System.out.print(count*count);
            System.out.print(' ');
        }
    }
}