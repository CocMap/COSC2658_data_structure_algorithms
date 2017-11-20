package week4;

public class ex4_TwoPowN {
    private static int TwoPowN(int n) {
        if (n == 0) return 1;
        else return TwoPowN(n - 1) * 2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int i = 0; i < arr.length; i++) {
            System.out.println("2^" + arr[i] + " = " + TwoPowN(arr[i]));
        }
    }
}
