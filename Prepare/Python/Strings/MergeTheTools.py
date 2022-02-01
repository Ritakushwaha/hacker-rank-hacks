'''def merge_the_tools(string, k):
    l = len(string)//k
    for i in range(l):
        l1 = string[:k]
        string = string[k:]
        l2 = list(l1)
        l3 = []
        s =""
        for i in l2:
            if i not in l3:
                l3.append(i)
        s += "".join(l3)
        print(s)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
'''

def merge_the_tools(string, k):
    for part in zip(*[iter(string)] * k):
        d = dict()
        print(''.join([ d.setdefault(c, c) for c in part if c not in d ]))

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)




