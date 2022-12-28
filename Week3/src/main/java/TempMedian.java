import java.util.Arrays;

public class TempMedian {
    public static void arrPrint(int[] elements) { //prints an array
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int[] calcValues(String[] tempReadings) {
        int[] tempVals = new int[tempReadings.length];
        tempVals[0] = Integer.parseInt(tempReadings[0]);
        for(int i = 1; i < tempReadings.length; i++) {
            if(tempReadings[i].equals(".")) {
                tempVals[i] = tempVals[i-1];
            } else if (tempReadings[i].equals("+")) {
                tempVals[i] = tempVals[i-1] + 1;
            } else if (tempReadings[i].equals("-")) {
                tempVals[i] = tempVals[i - 1] - 1;
            }
        }
        return tempVals;
    }

    public static double median(int[] sortList) {
        double middle;
        if (sortList.length % 2 == 1) {
            middle = sortList[sortList.length / 2];
        } else {
            middle = (sortList[sortList.length / 2] + sortList[(sortList.length / 2) - 1])/2.;
        }
        return middle;
    }


    public static void main(String[] args) {
        int[] inputs = new int[args.length];
        inputs = calcValues(args);
        arrPrint(inputs);
        Arrays.sort(inputs);
        arrPrint(inputs);
        System.out.println(median(inputs));
    }

}
