public class ImQuadraticSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if (a == 0) {
            System.out.println(-c/b);
        } else if ((b*b - 4*a*c) < 0) {
            double realSol = -b/2*a;
            double imagSol = Math.sqrt(Math.abs(b*b - 4*a*c))/2*a;
            System.out.println(realSol + " + " + imagSol + "i");
            System.out.println(realSol + " - " + imagSol + "i");
        } else {
            double sol1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
            double sol2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
            System.out.println(sol1);
            System.out.println(sol2);
        }
    }
}