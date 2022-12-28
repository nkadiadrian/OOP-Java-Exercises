public class MeanVariance {
    public static double mean(double[] meanList) {
        double total = 0;
        for (int i = 0; i < meanList.length; i++) {
            total += meanList[i];
        }
        return (total/(meanList.length));
    }

    public static double variance(double[] varyList) {
        double total = 0;
        double meanNum = mean(varyList);
        for (int i = 0; i < varyList.length; i++) {
            total += ((varyList[i] - meanNum)*(varyList[i] - meanNum));
        }
        return (total/(varyList.length));
    }

    public static void main(String[] args) {
        double[] numList = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            numList[i] = Double.parseDouble(args[i]);
        }
        System.out.println(mean(numList));
        System.out.println(variance(numList));
    }
}
