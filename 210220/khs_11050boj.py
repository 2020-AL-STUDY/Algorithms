import sys

N, K = map(int, (sys.stdin.readline().split()))

tmp = 1
tmpp = 1
while K>0:
    tmp *= N
    tmpp *= K
    K-=1
    N-=1



print(tmp//tmpp)
