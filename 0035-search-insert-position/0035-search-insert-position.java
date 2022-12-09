class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public int binarySearch(int [] arr, int first, int last, int target){
        // if(first>last){
        //     return first ;
        // }
        // int mid =last-(last-first)/2;
        // if(target>arr[mid])
        //     return binarySearch(arr, mid+1, last, target);
        // if(target<arr[mid])
        //     return binarySearch(arr, first, mid-1, target);
        // return mid ;
        
        while(first<=last ){
            int mid = last -(last-first )/2;
            if(mid<arr.length && target> arr[mid]){
                first = mid+1; 
                
            }else if(target<arr[mid]){
                last = mid-1;
            }else if(target == arr[mid]){
                return mid ;
            }
        }
        return first;
        
       
    }
}