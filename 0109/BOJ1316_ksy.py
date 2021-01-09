import sys

N = int(sys.stdin.readline())
words = []

for _ in range(N):
    words.append(sys.stdin.readline().strip())

cnt = 0
for w in words:
    tmp = set()
    chk = True
    tmp.add(w[0])
    for i in range(1, len(w)):
        if w[i] in tmp:
            if w[i - 1] != w[i]:  # and (w[i] != w[i + 1]):
                chk = False
                break
        tmp.add(w[i])

    if chk:
        cnt += 1

print(cnt)
