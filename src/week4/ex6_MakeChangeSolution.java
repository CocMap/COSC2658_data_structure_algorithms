package week4;

public class ex6_MakeChangeSolution {
    public static int makeChange(int[] coins, int change) {
        if (change == 0) return 0;

        int[] minCoins = new int[change + 1];
        minCoins[0] = 0; // do not need any coin to get 0 change

        for (int i = 1; i <= change; i++)
            minCoins[i] = Integer.MAX_VALUE;

        for (int i = 0; i <= change; i++) {
            for (int coin : coins) {
                if (i + coin <= change) {
                    if (minCoins[i] == Integer.MAX_VALUE) {
                        minCoins[i + coin] = minCoins[i + coin];
                    } else {
                        minCoins[i + coin] = Math.min(minCoins[i + coin], minCoins[i] + 1);
                    }
                }
            }
        }
        if (minCoins[change] >= Integer.MAX_VALUE)
            return -1;

        return minCoins[change];
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 20, 25};
        int[] coins2 = {1, 5, 10, 25};

        int change = 63;

        System.out.println("Return " + makeChange(coins, change));
    }
}
