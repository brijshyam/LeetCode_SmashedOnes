class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len1 = nums1.length; 
        int len2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        if(len1> len2){
            for(int i : nums1){
                hm.put(i, hm.getOrDefault(i, 0)+1);
            }
            for(int i : nums2){
                if(hm.containsKey(i)){
                    list.add(i);
                    hm.put(i, hm.get(i)-1);
                    if(hm.get(i)==0)
                        hm.remove(i);
                }
            }
        }else if(len2>=len1){
            for(int i : nums2){
                hm.put(i, hm.getOrDefault(i, 0)+1);
            }
            for(int i: nums1){
                if(hm.containsKey(i)){
                    list.add(i);
                    hm.put(i, hm.get(i)-1);
                    if(hm.get(i)==0)
                        hm.remove(i);
                }
            }
        }
        int [] res = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            res[i]= list.get(i);
        }
            
        return res;
    }
}