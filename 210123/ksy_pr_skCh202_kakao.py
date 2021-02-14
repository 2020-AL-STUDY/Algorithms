def isBalanced(p):
    ch = True
    l, r = 0, 0
    arr = []  # as Stack

    for i in range(len(p)):
        if p[i] == "(":  # left
            l += 1
            arr.append("(")
        else:  # right
            r += 1
            if not arr:  # arr isEmpty?
                ch = False
            else:
                arr.pop()
        if l == r:
            pos = i + 1  # u, v 분리 위치
            return ch, pos

    return True  # 실제로 이 코드를 실행할 일은 없다.


def solution(p):
    # 1
    if not p:
        return p

    # 2
    correct, idx = isBalanced(p)

    u = p[0:idx]
    v = p[idx:]

    # 3
    if correct:
        return u + solution(v)

    # 4
    answer = '(' + solution(v) + ')'
    u = u[1:len(u) - 1]
    for c in u:
        if c == "(":
            answer += ")"
        else:
            answer += "("

    return answer