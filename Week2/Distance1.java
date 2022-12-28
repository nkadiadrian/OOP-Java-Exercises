public class Distance1 {
    public static void main( String [] args ){
        int point1 = Integer.parseInt(args[0]);
        int point2 = Integer.parseInt(args[1]);
        int separation = Math.max(point1, point2) - Math.min(point1, point2);
        System.out.println(separation);
    }
}