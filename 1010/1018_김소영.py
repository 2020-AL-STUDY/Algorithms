def check88(board):
    white, black = 0, 0  # 해당 색상으로 변경해야 하는 갯수
    for k in range(8):  # 8x8 배열 검사
        for l in range(8):
            if (k + l) % 2 == 0:  # [e, e] or [o, o]
                if board[k][l] != 'W':  # 시작이 White
                    white += 1
                if board[k][l] != 'B':  # 시작이 black
                    black += 1
            else:
                if board[k][l] != 'B':  # 시작이 white
                    white += 1
                if board[k][l] != 'W':  # 시작이 black
                    black += 1
    return white, black


N, M = [int(num) for num in input().strip().split()]
list = []  # inputs
for row in range(N):
    list.append(input().strip())
min = N * M  # min value
for i in range(N - 7):  # index별 8x8 배열 방문
    for j in range(M - 7):
        temp = [t[0+j:8+j] for t in list[0+i:8+i]]
        whites, blacks = check88(temp)
        # find min value
        if min > whites: min = whites
        if min > blacks: min = blacks
print(min)
