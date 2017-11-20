package week4;

import java.util.Arrays;

public class ex9_FindMaxAndMin {
//    public static double[] findMaxAndMin(double[] arr){
//
//    }

    public static int[] findMaxAndMin(int[] a, int i, int j) {
        int localmin, localmax;
        int mid, max1, min1, max2, min2;
        int[] result = new int[2];

        //Small(P) when P is one element
        if (i == j) {
            localmin = a[i];
            localmax = a[i];
        } else {
            // if P is not small, divide P into sub-problems.
            // where to split the set
            mid = (i + j) / 2;
            // Solve the sub-problems.
            int[] result1 = findMaxAndMin(a, i, mid);
            int[] result2 = findMaxAndMin(a, mid + 1, j);
            max1 = result1[0];
            min1 = result1[1];
            max2 = result2[0];
            min2 = result2[1];
            // Combine the solutions.
            if (max1 < max2) localmax = max2;
            else localmax = max1;
            if (min1 < min2) localmin = min1;
            else localmin = min2;
        }

        result[0] = localmax;
        result[1] = localmin;
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 8, 3, 2, 6, 4};
        int[] result = findMaxAndMin(a, 2, 4);

        System.out.println("result is " + Arrays.toString(result));
    }
}
