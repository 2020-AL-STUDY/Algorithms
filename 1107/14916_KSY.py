import sys
sys.setrecursionlimit(1000000)


def dp(n):
    if n == 0: return mem[n]
    if n < 0: return 100001  # max

    res = mem[n]
    if res != -1:  # already calculated
        return res

    mem[n] = 100001  # max
    res = min(mem[n], dp(n - 5) + 1)  # coin 5
    res = min(res, dp(n - 2) + 1)  # coin 2

    return res


n = int(input())
mem = [-1 for i in range(100001)]  # memoization
result = dp(n)
if result > 100000:  # can't change
    print(-1)
else:
    print(result + 1)
