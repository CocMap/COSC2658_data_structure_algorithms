//package week4;
//
//public class ex6_MakeChange {
//    public static void makeChangeNormal(int[] coins, int change) {
//        int coinsNum = 0;
//
//        for(int i = 0; i < coins.length; i++) {
//            if (coins[i] == change) {
//                System.out.printf("Return " + coins[i] + "(1)");
//            }
//        }
//
//        //normal algorithms
//        System.out.printf("Return ");
//        for (int i = coins.length - 1; i >= 0; i--) {
//            if (change >= coins[i]) {
//                coinsNum = change / coins[i];
//                System.out.printf(coins[i] + "(" + coinsNum + "), ");
//                change = change % coins[i];
//            }
//        }
//    }
//
//    final class MyResult {
//        private final int coinsNum;
//        private final int coinsValue;
//
//        public MyResult (int coinsNum, int coinsValue) {
//            this.coinsNum = coinsNum;
//            this.coinsValue = coinsValue;
//        }
//
//        public int getCoinsNum() {
//            return coinsNum;
//        }
//
//        public int getCoinsValue() {
//            return coinsValue;
//        }
//    }
//
//        //main function
//        public static MyResult makeChangeRecursion(int[] coins, int change) {
//            int coinsNum = 0;
//            int coinsValue = 0;
//
//            for (int i = coins.length - 1; i >= 0; i++) {
//                if (change % coins[i] != 0) {
//                    coinsValue = coins[i];
//                    coinsNum = change / coins[i];
//
////                    System.out.println("coinsNum = " + coinsNum + ", coinsValue = " + coinsValue);
//                }
//            }
//            return new MyResult(coinsNum, coinsValue);
//        }
//
//    public static void main(String[] args) {
//        int[] coins = {1,5,10,20,25};
//        int change = 137;
//
//        makeChangeNormal(coins, change);
//
//        MyResult result = makeChangeRecursion(coins, change);
//
//        System.out.println(result.getCoinsNum() + " " + result.getCoinsValue());
//
//
////        System.out.println("result " + coinsNum);
//
//    }
//}
