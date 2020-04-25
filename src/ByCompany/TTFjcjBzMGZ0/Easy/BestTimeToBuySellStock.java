package ByCompany.TTFjcjBzMGZ0.Easy;

public class BestTimeToBuySellStock {
    private int maxProfit(int[] prices) {
        int profit =0;

        for(int i=0; i< prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i] > prices[j]) break;
                else {
                    profit = Math.max(prices[j] - prices[i], profit);
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuySellStock().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(new BestTimeToBuySellStock().maxProfit(new int[]{7,6,4,3,1}));
    }
}
