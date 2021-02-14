def solution(n):
    answer = 0

    s = ""
    while n >= 3:
        s = str(n % 3) + s
        n //= 3
    s = str(n) + s

    answer = int(s[::-1], 3)

    return answer