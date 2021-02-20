def solution(N, stages):
    answer = []

    fail = {}
    nPpl = len(stages)

    for i in range(1, N+1):
        if nPpl == 0:
            fail[i] = 0
        else:
            count = stages.count(i)
            fail[i] = count / nPpl

        nPpl = nPpl - count

    answer = sorted(fail, key=lambda x:fail[x], reverse=True)

    return answer

stages = [2, 1, 2, 6, 2, 4, 3, 3]
print(solution(5, stages))