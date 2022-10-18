class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new  Stack<>();
        Stack<Character> st2 = new  Stack<>();
        
        int n1=s.length();
        int n2= t.length();
        
        for(int i=0; i<n1; i++)
		{
			char ch= s.charAt(i);
			if(!st1.isEmpty() && ch=='#')
				st1.pop();
			else if(ch!='#')
				st1.push(ch);
		}
		for(int i=0; i<n2; i++)
		{
			char ch= t.charAt(i);
			if(!st2.isEmpty() && ch=='#')
				st2.pop();
			else if(ch!='#')
				st2.push(ch);
		}
        
//         for(int i =0; i<s.length(); i++){
//             if(s.charAt(i)=='#' && !st1.isEmpty()){
//                 st1.pop();
//             }else{
//                 st1.push(s.charAt(i));
//             }
//         }
//         for(int i =0; i<t.length(); i++){
//             if(t.charAt(i)=='#' && !st2.isEmpty()){
//                 st2.pop();
                
//             }else{
//                 st2.push(t.charAt(i));
//             }
            
//         }
        while(!st1.isEmpty() && !st2.isEmpty() ){
            if(st1.peek() != st2.peek())
                return false;
            st1.pop();
            st2.pop();
        }
        if(!st1.isEmpty() || !st2.isEmpty()){
            return false;
        }
        
    
        
        return true;
        
        
    }
}