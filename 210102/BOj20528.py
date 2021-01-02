import sys

N = int(sys.stdin.readline())
strs = map(str, sys.stdin.readline().strip().split(" "))
strSet = set()

for str in strs:
    strSet.add(str[0])
    strSet.add(str[len(str)-1])

print(1 if len(strSet) == 1 else 0)
