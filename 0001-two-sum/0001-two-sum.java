class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i < nums.length; i++ ){
            int temp = target - nums[i];
            if(hm.containsKey(temp)){
                 int []  res = {hm.get(temp), i} ;
                return res;

            }
            hm.put(nums[i], i);

        }
        return null;
    
        
   
    }
}