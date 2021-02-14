import sys

N, K = map(int, sys.stdin.readline().split())
p_num = [0 for i in range(N+1)]
p_num[0] = 1
p_num[1] = 1

cnt = 0

for i in range(2, N+1):
    if p_num[i] == 0:
        for j in range(i, N+1, i):
            if p_num[j]==0:
                p_num[j]=1
                cnt+=1
                if cnt == K:
                    print(j)

    else:
        continue


