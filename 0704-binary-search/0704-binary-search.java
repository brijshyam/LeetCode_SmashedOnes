class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums,target, 0, nums.length-1);
        
    }
    
    public int binarySearch(int []arr, int key , int start, int end){
        int mid = end-(end-start)/2;
        
        if(start>end)
            return -1;
        
        if(arr[mid]>key){
            return binarySearch(arr, key, start, mid-1);
        }
        if(arr[mid]<key)
            return binarySearch(arr, key, mid+1, end);
        
        return mid ;
    }
}