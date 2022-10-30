class Solution {
    public int addDigits(int num) {
        
        if(num<=9){
            return num;
        }
        int newNum=0;
        while(num>0){
            int digit = num%10;
            num=num/10;
            newNum+=digit;
        }
        // System.out.print(newNum+"-> ");
        return addDigits(newNum);
        
    }
}