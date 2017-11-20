package week4;

public class ex5_RecusiveFunctionList {
    private static int XPowerN (int x, int n){
       if(n == 0) return 1;
       else return (x*XPowerN(x, n -1));
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 3;

        System.out.println(x + "^" + n + " = " + XPowerN(x,n));
    }
}
