class Solution {
    public boolean isPalindrome(String s) {
        String str1 =s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        return checkPal(str1);
        
    }
    
    public static boolean checkPal(String str) {
        int l = 0;
        int r = str.length() - 1;

        while (l <=r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}