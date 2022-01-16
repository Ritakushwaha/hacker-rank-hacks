#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Jan 16 16:55:49 2022

@author: rita
"""
def split_and_join(line):
    line = line.replace(" ", "-")
    return line

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)