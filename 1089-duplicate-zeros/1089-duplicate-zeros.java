class Solution {
    public void duplicateZeros(int[] arr) {
        
        for(int i=0; i<arr.length-1; ){
            if(arr[i]==0){
                int j=arr.length;
                while(j-->i+1){
                    // System.out.println("copying the element at "+(j-1)+ " to "+j);
                    arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i+=2;
                // System.out.println("array is now : "+Arrays.toString(arr));
            }else{
                ++i;
            }
                
        }
        
    }
}