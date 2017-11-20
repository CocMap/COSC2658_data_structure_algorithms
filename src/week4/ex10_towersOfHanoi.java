package week4;

import java.util.Scanner;

public class ex10_towersOfHanoi {
    public static class TowersOfHanoi {

        //n = number of dics
        public void algorithms(int n, String start, String auxiliary, String end) {
            if (n == 1) {
                System.out.println(start + " to " + end);
            } else {
                algorithms(n - 1, start, end, auxiliary);
                System.out.println(start + " to " + end);
                algorithms(n - 1, auxiliary, start, end);
            }
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();

        System.out.print("How many disc: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();

        towersOfHanoi.algorithms(discs, "A", "B", "C");
    }
}

