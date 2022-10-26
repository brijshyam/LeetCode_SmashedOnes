class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int right=1; 
        int maxP = 0;
        while(right<prices.length){
            if(prices[right]< prices[left]){
                left= right;
                right++;
            }else{
                int profit = prices[right]- prices[left];
                maxP=Math.max(maxP, profit);
                right++;
            }
        }
        return maxP;
        
    }
}