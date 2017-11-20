package week4;

public class ex1_Test {
    private static void xMethod1( int n ) {
        if (n > 0) {
            System.out.print(n + " ");
            xMethod1(n - 1);
        }
    }

    private static void xMethod2( int n ) {
        if (n > 0) {
            xMethod2(n - 1);
            System.out.print(n + " ");          //call and store in the STACK
            /*
                    order(from bottom)            STACK             WORK ORDER (**IMPORTANT)
                        5                       xMethod(1)                  1st -> print "1" first
                        4                       xMethod(2)                  2
                        3                       xMethod(3)                  3
                        2                       xMethod(4)                  4
                        1                       xMethod(5)                  5
             */
        }
    }

    public static void main(String[] args) {
        xMethod1(5);                    //print: 5 4 3 2 1
        System.out.println();
        xMethod2(5);                    //print: 1 2 3 4 5
    }
}
