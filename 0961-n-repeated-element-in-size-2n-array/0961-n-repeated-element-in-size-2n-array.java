class Solution {
    public int repeatedNTimes(int[] nums) {
        int res = 0 ;
        HashSet<Integer> hs = new HashSet<>();
        for( int num: nums){
            res = num;
            if(hs.contains(res))
                break;
            else
                hs.add(res);
        }
        return res;
    }
}