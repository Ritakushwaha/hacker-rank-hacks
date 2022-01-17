#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Jan 16 18:37:43 2022

@author: rita
"""
'''def solve(s):
    s = s.title()
    return s'''

def solve(s):
    words = s.split(" ")
    capitalized_words = [w.capitalize() for w in words]
    return " ".join(capitalized_words)

s = input()
print(solve(s))