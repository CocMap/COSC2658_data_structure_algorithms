package week4;

public class ex6_makeChangeNormal {
    public static void makeChangeNormal(int[] coins, int change) {
        int coinsNum = 0;

        for(int i = 0; i < coins.length; i++) {
            if (coins[i] == change) {
                System.out.printf("Return " + coins[i] + "(1)");
            }
        }

        //normal algorithms
        System.out.printf("Return ");
        for (int i = coins.length - 1; i >= 0; i--) {
            if (change >= coins[i]) {
                coinsNum = change / coins[i];           //num of coins
                System.out.printf(coins[i] + "(" + coinsNum + "), ");
                change = change % coins[i];             //update change
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 20, 25};
        int change = 137;

        makeChangeNormal(coins, change);

    }
}
