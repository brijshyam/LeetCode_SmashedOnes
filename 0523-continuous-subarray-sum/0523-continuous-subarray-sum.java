class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int currsum = 0;
        int prevsum = 0;
        for(int j = 0; j<nums.length; j++){
            currsum += nums[j];
            if(set.contains(currsum%k)){
                return true;
            }
            // point 1
            currsum %= k;
            
            //point 2
            set.add(prevsum);
            prevsum = currsum;
        }
        return false;
    }
}