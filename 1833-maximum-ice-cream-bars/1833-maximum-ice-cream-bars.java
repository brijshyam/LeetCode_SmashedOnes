class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // using sort method this becomes really easy
           Arrays.sort(costs);
           for(int i=0;i<costs.length;i++){
               if ((coins -= costs[i])< 0)
                    return i;
           }
            return costs.length;
    }
}