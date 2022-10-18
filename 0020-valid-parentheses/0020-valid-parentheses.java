class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        int len =s.length();
        boolean flag=false;
        
        for(int i=0; i<len; i++){
            flag= false;
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
                else if(ch==')' && !st.isEmpty() && st.peek()=='('){
                    st.pop();
                     flag= true;
                    }
                else if(ch=='}' && !st.isEmpty() &&  st.peek()=='{'){
                    st.pop();
                     flag= true;
                    }
                else if(ch==']' && !st.isEmpty() && st.peek()=='['){
                    st.pop();
                     flag= true;
                    }
                else
                    break;
            
        }
        if(st.isEmpty() && flag)
                return true;
            else
                return false;
    }
    
}