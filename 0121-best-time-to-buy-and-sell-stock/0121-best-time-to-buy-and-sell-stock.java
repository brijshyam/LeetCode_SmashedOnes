class Solution {
    public int maxProfit(int[] prices) {
        
        Stack<Integer> st = new Stack<>();
        int mProfit = 0;
        for(int i =0; i<prices.length; i++){
            if(st.isEmpty() || st.peek()>prices[i]){
                st.push(prices[i]);
            }else{
                mProfit = Math.max(mProfit, (prices[i]-st.peek()));
            }
            
        }
        return mProfit;
    }
}