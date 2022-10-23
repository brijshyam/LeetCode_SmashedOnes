class Solution {
    public int repeatedNTimes(int[] nums) {
        
        int a = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:nums){
            Integer r = map.getOrDefault(i, 0);
            r++;
            if (r == a) 
                return i;
            map.put(i, r);
        }
        return 0;
        
    }
}