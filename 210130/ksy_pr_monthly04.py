def solution(s):
    zeros, cnt = 0, 0

    while s != "1":
        cnt += 1

        # remove 0s
        tmp = ""
        for c in s:
            if c != "0":
                tmp += c
        num = len(tmp)
        zeros += len(s) - num

        # to binary
        tmp = ""
        while num >= 2:
            tmp = str(num % 2) + tmp
            num //= 2
        tmp = str(num) + tmp
        s = tmp

    return [cnt, zeros]