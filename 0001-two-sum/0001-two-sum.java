class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    
    Map<Integer, Integer> hm = new HashMap<>();
    hm.put(nums[0],0);
        
    for(int i =1; i < nums.length; i++ ){
        int temp = target - nums[i];
        if(hm.containsKey(temp)){
            res[1]=i;
            res[0]= hm.get(temp);
            break;
        }
        hm.put(nums[i], i);
        
    }
    return res;
}
}