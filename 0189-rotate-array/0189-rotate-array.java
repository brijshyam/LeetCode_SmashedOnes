class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k>nums.length){
            k=k%nums.length;
        }
        int [] temp = new int[nums.length];
        int j=0;
        for(int i=nums.length -k; i<nums.length; i++, j++){
            temp[j] = nums[i];
            // System.out.print(nums[i]+" ");
        }
        
        for(int i=0; i<nums.length-k; i++ ){
            System.out.print(nums[i]+" ");
            temp[j++] = nums[i];
        }
        
        for(int i=0; i<temp.length; i++){
            nums[i]=temp[i];
            
            // System.out.println(nums[i]);
        }
        
        
    }
}