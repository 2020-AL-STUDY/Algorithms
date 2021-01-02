import sys

N = int(sys.stdin.readline())


list = sys.stdin.readline().split()
s = set([])
for i in range(N):

    s.add(list[i][0])


print(1 if len(s)==1 else 0)
