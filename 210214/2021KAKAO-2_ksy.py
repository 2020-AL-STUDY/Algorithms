from itertools import combinations


def dictMax(dict, course):
    tmp = {}
    for c in course:
        tmp[c] = []

    keys = dict.keys()
    for d in keys:
        if dict[d] > 1:
            l = len(d)
            if l in course:
                te = tmp[l]
                if not te or dict[te[0]] == dict[d]:
                    te.append(d)
                elif dict[te[0]] < dict[d]:
                    tmp[l] = [d]

    res = []
    for i in tmp:
        res += tmp[i]

    return res


def solution(orders, course):
    answer = []

    tmp = []
    orders = [sorted(o) for o in orders]
    for o in orders:
        for c in course:
            tmp += map(''.join, combinations(o, c))

    dict = {}
    for a in tmp:
        if not a in dict:
            dict[a] = 0
        dict[a] += 1
    answer = dictMax(dict, course)
    answer.sort()

    return answer
