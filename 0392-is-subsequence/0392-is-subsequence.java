class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() == 0) 
            return true;
        int first = 0, second = 0;
        while (second < t.length()) {
            if (t.charAt(second) == s.charAt(first)) {
                first++;
                if (first == s.length()) 
                    return true;
            }
            second++;
        }
        return false;
    }
    
}