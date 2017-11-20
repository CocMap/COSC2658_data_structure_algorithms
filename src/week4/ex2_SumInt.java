package week4;

public class ex2_SumInt {
    private static int SumInt(int n){
        //assume that n >= 1
        if(n == 1)
            return 1;
        if(n <= 0)
            return 0;
        else {
            return SumInt(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.printf("Result is " + SumInt(-4));
    }
}
