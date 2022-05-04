#!/bin/python3

def factorial(n):
    if n<=1:
        return 1
    else:
        result = n * factorial(n - 1)
        return result
    

if __name__ == '__main__':
    n = int(input().strip())
    result = factorial(n)
    print(result)
