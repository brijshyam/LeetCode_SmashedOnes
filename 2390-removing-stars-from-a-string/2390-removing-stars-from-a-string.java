class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='*' && !st.isEmpty()){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        // String str="";
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return String.valueOf(sb);
        
    }
}