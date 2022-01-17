#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Jan 16 17:58:04 2022

@author: rita
"""
'''

#size 3

----c----
--c-b-c--
c-b-a-b-c
--c-b-c--
----c----

'''
import string
alpha = string.ascii_lowercase

def print_rangoli(n):
    L = []
    
    for i in range(n):
        s = "-".join(alpha[i:n])
        string = (s[::-1]+s[1:]).center(4*n-3,"-")
        L.append(string)
    print('\n'.join(L[:0:-1]+L))
    
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)