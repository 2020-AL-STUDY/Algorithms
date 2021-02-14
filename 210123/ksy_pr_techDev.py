def solution(progresses, speeds):
    answer = []

    while progresses:
        days = -((progresses[0] - 100) // speeds[0])
        progresses = [(p + (s * days)) for p, s in zip(progresses, speeds)]

        cnt = 0
        while progresses[0] >= 100:
            progresses.pop(0)
            speeds.pop(0)
            cnt += 1

            if not progresses:
                break

        answer.append(cnt)

    return answer