class Solution {
    public int xorOperation(int n, int start) {
        
        int xored =0;
        for(int i =0; i< n; i++){
            xored^=start+2*i;
        }
        return xored;
        
    }
}