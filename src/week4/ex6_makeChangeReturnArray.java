package week4;

public class ex6_makeChangeReturnArray{
        public static int[] makeChangeGreety(int[] coins, int change) {
            int[] usedCoins = new int[coins.length];

            for (int i = 0; i < coins.length; i++) {
                if (coins[i] == change) {
                    usedCoins[i] = 1;
                    return usedCoins;
                }
            }

            //normal algorithms
            for (int i = coins.length - 1; i >= 0; i--) {
                if (change >= coins[i]) {
                    usedCoins[i] = change / coins[i];           //num of coins
                    change = change % coins[i];             //update change
                }
            }
            return usedCoins;
        }

        public static void main(String[] args) {
            int[] coins = {1, 5, 10, 20, 25};
            int change = 137;

            int[] usedCoins = new int[coins.length];
            usedCoins = makeChangeGreety(coins, change);
            for(int i = 0; i < usedCoins.length; i++){
                System.out.println("Return value - " + coins[i] + ", number - " + usedCoins[i]);
            }
        }
}
