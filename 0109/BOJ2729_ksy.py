import sys


def addBinary(a, b) -> str:
    a = int(a, 2)
    b = int(b, 2)

    tmp = a + b

    if tmp == 0:
        return "0"

    res = ""

    while True:
        r = tmp % 2
        tmp //= 2
        res = str(r) + res
        if tmp < 2:
            res = str(tmp) + res
            break

    return str(int(res))


N = int(input())

results = []
for _ in range(N):
    a, b = sys.stdin.readline().strip().split(" ")
    results.append(addBinary(a, b))

for i in range(N):
    print(results[i])