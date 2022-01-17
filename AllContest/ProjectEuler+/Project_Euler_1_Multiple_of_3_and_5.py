#!/bin/python3
t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    thr = (n-1)//3
    fiv = (n-1)//5
    fif = (n-1)//15
    
    ans = int(3*thr*(thr+1)//2 + 5*fiv*(fiv+1)//2 - 15*fif*(fif+1)//2)
    print(ans)