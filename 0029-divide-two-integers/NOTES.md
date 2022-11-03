```
public int divide(int A, int B) {
if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
while (a - b >= 0) {
for (x = 0; a - (b << x << 1) >= 0; x++);
res += 1 << x;
a -= b << x;
}
return (A > 0) == (B > 0) ? res : -res;
}
```
​
​
**Solution 2: **
​
```
public int divide(int A, int B) {
if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
int a = Math.abs(A), b = Math.abs(B), res = 0;
for (int x = 31; x >= 0; x--)
if ((a >>> x) - b >= 0) {
res += 1 << x;
a -= b << x;
}
return (A > 0) == (B > 0) ? res : -res;
}
```
​
The java solution is very elegant and nicely handles the overflow! Didn't realize that a-b >= 0 is not the same as a >= b when overflow happens.
​