class Solution {
    public int reinitializePermutation(int n) {
        int temp = n/2, count = 1;
        while(temp != 1){
            if(temp %2==0) temp /= 2;
            else temp = n/2 + (temp-1)/2;
            count++;
        }
        return count;
    }
}