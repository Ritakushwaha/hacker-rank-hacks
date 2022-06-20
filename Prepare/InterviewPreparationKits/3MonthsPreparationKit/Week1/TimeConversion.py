#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):

    hh=int(s[:2])
    print(hh)
    if "PM" in s:
        if hh!=12:
            hh+=12

    if "AM" in s:
        if hh==12:
            hh=00
    
    hour=(str(hh)).zfill(2)
    
    return f"{hour}{s[2:-2]}"

if __name__ == '__main__':
    s = input()
    print(timeConversion(s))

