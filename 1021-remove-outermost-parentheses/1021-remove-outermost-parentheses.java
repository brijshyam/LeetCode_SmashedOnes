class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st = new Stack<>();
        StringBuilder sb= new StringBuilder();
        char [] arr = s.toCharArray();
        int size=0;
        for(char c : arr){
            if(c=='('){
                if(!st.isEmpty())
                    sb.append('(');
                st.add('(');
            }
            else{
                st.pop();
                if(!st.isEmpty())
                    sb.append(')');
            }
        }
        
        return sb.toString();
    }
}