public class QuadraticSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double sol1 = (-1*b + Math.sqrt(b*b - 4*a*c))/2*a;
        double sol2 = (-1*b - Math.sqrt(b*b - 4*a*c))/2*a;
        System.out.println(sol1);
        System.out.println(sol2);
    }
}