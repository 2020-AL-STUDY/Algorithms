def removeEndDot(string):
    res = ''

    for c in range(len(string)):
        if string[c] == '.':
            if c==0 or c == len(string) - 1:
                continue
        res += string[c]

    return res


def solution(new_id):
    answer = ''
    able = ['-', '_', '.']

    # 1
    new_id = new_id.lower()

    # 2
    for n in range(len(new_id)):
        if (new_id[n] in able) or (new_id[n].islower()) or (new_id[n].isdigit()):
            answer += new_id[n]

    # 3
    while ".." in answer:
        answer = answer.replace("..", ".")

    # 4
    answer = removeEndDot(answer)

    # 5
    if not answer:
        answer = "a"

    # 6
    if len(answer) >= 16:
        answer = answer[:15]
        if answer[len(answer) - 1] == '.':
            answer = answer[:len(answer) - 1]

    # 7
    if len(answer) <= 2:
        while True:
            if len(answer) == 3:
                break
            answer += answer[-1]

    return answer