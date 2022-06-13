#!/bin/python3

def plusMinus(arr):
    neg = 0
    pos = 0
    zeros = 0
    for i in arr:
        if i == 0:
            zeros += 1
        elif i<0:
            neg += 1
        else: 
            pos +=1
    
    print('%.6f'%(pos/len(arr)))
    print('%.6f'%(neg/len(arr)))
    print('%.6f'%(zeros/len(arr)))

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
