if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split()) #input n numbers with spaces

print(sorted(set(arr))[-2])
