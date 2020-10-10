N, M = [int(num) for num in input().strip().split()]

list = []
for row in range(N):
    list.append(input().strip())

min = N*M
for i in range(N - 7): # 8x8 slice
    for j in range(M - 7):
        whites, blacks = 0, 0
        for l in range(i, i + 8): # 8x8 내부 탐색
            for k in range(j, j + 8):
                if (k + l)%2 == 0: # 짝,짝 or 홀,홀
                    if list[l][k]!= 'W':
                        whites += 1
                    if list[l][k]!= 'B':
                        blacks += 1
                else:
                    if list[l][k]!= 'B':
                        whites += 1
                    if list[l][k]!= 'W':
                        blacks += 1
        # find min
        if min > whites:
            min = whites
        if min > blacks:
            min = blacks

print(min)