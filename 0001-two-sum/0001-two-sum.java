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
        
    //TWO POINTER APPROACH 
        // Arrays.sort(nums);
        // int left=0;
        // int right= nums.length-1;
        // while(left< right){
        //     int sum =nums[left]+nums[right];
        //     if(sum==target){
        //         res[0]=left;
        //         res[1]=right;
        //         return res;
        //     }else if(sum < target){
        //         left++;
        //     }else
        //         right--;
        // }
        return res;
    }
}