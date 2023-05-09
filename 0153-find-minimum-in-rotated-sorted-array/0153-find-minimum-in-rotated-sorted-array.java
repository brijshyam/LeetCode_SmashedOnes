class Solution {
    public int findMin(int[] nums) {
        int start =0; 
        int end = nums.length-1;
        if(nums.length == 2)
            return nums[0]< nums[1]? nums[0]:nums[1];
        if(nums[start]>nums[end]){
             
            while(start<end){
                int mid = start+(end-start)/2;
                if(nums[mid] < nums[mid+1] && nums[mid]< nums[mid-1]){
                    return nums[mid];
                }
                if(nums[mid+1]< nums[mid])
                    return nums[mid+1];
                if(nums[mid]>nums[start]){
                    start = mid;
                }else if(nums[mid]<nums[start])
                    end = mid;

            }
        }else{
            return nums[start];
        }
       
        return -1;
        
    }
}