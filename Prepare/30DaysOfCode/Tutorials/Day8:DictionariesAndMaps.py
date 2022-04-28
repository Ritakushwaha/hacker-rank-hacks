import re


def find_phone_num():
    n = int(input())
    record ={}
    for i in range(0,n):
        text = input().split()
        record[text[0]] = text[1]

    while True:
        try:
            ip = input()
            if ip in record:
                print(ip+"="+record[ip])
            else:
                print("Not found")
        except EOFError:
            break

find_phone_num()