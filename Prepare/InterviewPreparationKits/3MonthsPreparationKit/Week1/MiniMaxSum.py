#!/bin/python3

def miniMaxSum(arr):
    sort_arr = sorted(arr)
    print(sum(sort_arr[:4]),sum(sort_arr[-4:]))

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
