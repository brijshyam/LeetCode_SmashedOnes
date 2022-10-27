​
​
The main idea is to store the last seen positions of current (i-th) characters in both strings. If previously stored positions are different then we know that the fact they're occuring in the current i-th position simultaneously is a mistake. We could use a map for storing but as we deal with chars which are basically ints and can be used as indices we can do the whole thing with an array.
​
Check the code below. Happy coding!
​
public class Solution {
public boolean isIsomorphic(String s1, String s2) {
int[] m = new int[512];
for (int i = 0; i < s1.length(); i++) {
if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
}
return true;
}
}
The statement wants to mark each character modified in that array with a distinct value. And 0 is the default value, so we should not use it, otherwise we cannot distinguish between the default maker and the the marker we made. For example, "aa" and "ab", in the first loop(i=0), if m[a]=0 and m[a+256]=0, then in the second loop, we cannot distinguish between m[a]=0 and m[b+256]=0. In fact, the m[a] has been modified in the first loop. So it will fail as in the leetcode case.
​