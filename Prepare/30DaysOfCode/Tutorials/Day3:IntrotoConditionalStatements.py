#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Jan 17 12:39:56 2022

@author: rita
"""
#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    N = int(input().strip())

    if N%2 != 0:
        print("Weird")
    elif (N>=2 and N<=5) or N>20:
        print('Not Weird')
    else:
        print("Weird")
            
            
