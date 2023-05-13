class Solution {
    public boolean isPalindrome(String s) {
        String str1 =s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        return checkPal(str1);
        
    }
    
    public static boolean checkPal (String str){
    if (str.length() <= 1) {
        return true;
    }

    return str.charAt(0) == str.charAt(str.length() - 1) && checkPal(str.substring(1, str.length() - 1));
}

}