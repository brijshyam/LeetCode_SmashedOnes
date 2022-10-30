class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String i : operations){
            if(i.equals("--X") || i.equals("X--")){
                X-=1;
            }else{
                X+=1;
            }
        }
        return X;
        
    }
}