#!/bin/python3

if __name__ == '__main__':
    n = int(input().strip())
    arr = list(map(int, input().rstrip().split()))
    rev_arr = reversed(arr)
    for i in rev_arr:
        print(i,end=' ')
