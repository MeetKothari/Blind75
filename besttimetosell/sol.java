class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0){
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0; // initialize

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i]; // update as needed
            } else if (prices[i] - minPrice > maxProfit){

                maxProfit = prices[i] - minPrice;

            }
        }

        return maxProfit;
        
    }
}
