import java.util.Arrays;

public class Sieve {
    public static void arrPrint(int[] elements) { //prints an array
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
    }

    public static int[] sieveMaker(int n) {
        int[] sieve = new int[n-1];
        for (int i = 2; i <= n; i++) {
            sieve[i-2] = i;
        }
        return sieve;
    }

    public static void main(String[] args) {
        int p = 2;
        int n = 20;
        int[] grid = sieveMaker(n);
        boolean firstNumberOutput = true;

        while (p < n) {
            if (!firstNumberOutput) {
                System.out.print(" ");
            }
            System.out.print(p);
            firstNumberOutput = false;

            for (int i = 0; i < grid.length; i++) {
                if (grid[i] % p == 0) {
                    grid[i] = 0;
                }
            }
            int holder = p;
            for (int i = 0; i < grid.length && p == holder; i++) {
                if (grid[i] > p) {
                    p = grid[i];
                    break;
                }
            }
            if (p == holder) {
                p = n + 1;
            }
        }

    }

}

