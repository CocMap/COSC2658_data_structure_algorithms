package week4;

public class tutorial4 {
    public static void main (String[]args) {
        xMethod(5);
    }


    //QUESTION 1A   -> print = 5 4 3 2 1
    public static void xMethod ( int n){
        if (n > 0) {
            System.out.println(n + " ");
            xMethod(n - 1);
        }
    }

    //QUESTION 1B -> print = 1 2 3 4 5
//    public static void xMethod ( int n){
//        if (n > 0) {
//            xMethod(n - 1);
//            System.out.println(n + " ");
//        }
//    }

    public static void Recursive4 {

    }

}