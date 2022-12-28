public class Mode {
    public static void repeat(int n) {
        System.out.print(' ');
        for (int i = 0; i < n; i++) {
            System.out.print('.');
        }
    }

    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 0; i < args.length; i ++) {
            count[Integer.parseInt(args[i])] ++;
        }
        int indexer = 0;
        for (int i = 0; i < 10; i++) {
            System.out.format("[%ds: %d]", i, count[i]);
            if (count[i] > 0) {
                repeat(count[i]);
            }
            System.out.println();
            if (count[i] > count[indexer]) {
                indexer = i;
            }
        }
        System.out.format("Mode: %d", indexer);
    }
}
