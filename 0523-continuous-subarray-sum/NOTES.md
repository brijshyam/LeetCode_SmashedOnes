Map<Integer,Integer> map=new HashMap<>();
map.put(0,-1);
int sum=0;
for(int i=0;i<nums.length;i++){
sum+=nums[i];
sum%=k;
Integer last=map.get(sum);
if(last!=null ) {
if(i-last>1)
return true;
else continue;
}
map.put(sum,i);
}
return false;