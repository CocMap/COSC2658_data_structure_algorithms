package week4;

public class ex3_GreatestCommonDivision {
    private static int gcd(int a, int b){
        if(b == 0)  return a;
        else{
            return gcd(b, a % b);
             /*     example gcd(24,18)

                    order(from bottom)            STACK             WORK ORDER (**IMPORTANT)
                        6                       gcd(6,0)                    return a = 6
                        5                       gcd(6,6)
                        4                       gcd(12,6)**
                        3                       gcd(6,12)**
                        2                       gcd(18,6)
                        1                       gcd(24,18)

                    **special case: a<b -> it will reversed -> the value of a or b doesn't matter here
             */
        }
    }

    public static void main(String[] args) {
        System.out.println("gcd(24,18) is: " + gcd(18,24));         //work perfect with case a < b
        System.out.println("gcd(25,15) is: " + gcd(25,15));
        System.out.println("gcd(80,10) is: " + gcd(80,10));
    }
}
