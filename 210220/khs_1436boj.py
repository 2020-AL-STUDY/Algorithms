import sys

N = int(sys.stdin.readline())

cnt = 0
tmp =0
while(cnt!=N):
    tmp += 1
    sstr = str(tmp)
    if("666" in sstr):
        cnt+=1


print(tmp)

