class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target) 
                return  mid;
            if(arr[mid] >= arr[low]){
                /* left half sorted */
                if(target >= arr[low] && target < arr[mid]) high = mid-1;
                else low = mid+1;
            }
            else{
                /* right half is sorted */
                if( target > arr[mid] && target <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}