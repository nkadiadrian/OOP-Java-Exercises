public class MultiplesLoopRange {
    public static void main(String[] args) {
        int startNum = Integer.parseInt(args[0]);
        int stopNum  = Integer.parseInt(args[1]);
        double multiple = Double.parseDouble(args[2]);
        if (startNum <= stopNum) {
            for (int count = startNum; count <= stopNum; count++) {
                if (count % multiple == 0) {
                    System.out.print(count);
                    System.out.print(' ');
                }
            }
        } else {
            for (int count = startNum; count >= stopNum; count--) {
                if (count % multiple == 0) {
                    System.out.print(count);
                    System.out.print(' ');
                }
            }
        }
    }
}