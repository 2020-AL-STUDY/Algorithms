import sys
x = sys.stdin.readline().rstrip().rsplit()
N = int(x[0])
M = int(x[1])
x = [sys.stdin.readline() for i in range(N)]
minValue =[]


for a in range(N-7):
    for b in range(M-7):
        w=0
        bb=0

        for i in range(a,a+8):
            str = x[i]
            for j in range(b,b+8):

                if i % 2 == 0:
                    if j % 2 == 0:
                        if str[j] == "B":
                            w += 1
                        else:
                            bb += 1
                    if j % 2 != 0:
                        if str[j] == "B":
                            bb += 1
                        else:
                            w += 1
                else:
                    if j % 2 == 0:
                        if str[j] == "B":
                            bb += 1
                        else:
                            w += 1
                    if j % 2 != 0:
                        if str[j] == "B":
                            w += 1
                        else:
                            bb += 1
        minValue.append(w)
        minValue.append(bb)

print(min(minValue))







