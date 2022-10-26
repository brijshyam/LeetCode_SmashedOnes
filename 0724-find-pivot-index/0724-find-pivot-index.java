class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        int sum =0; 
        for(int i : nums)
            total+=i;
        for(int i =0; i< nums.length; sum+=nums[i++]){
            if(2*sum==(total - nums[i]))
                return i;
        }
        
        return -1;
        
    }
}