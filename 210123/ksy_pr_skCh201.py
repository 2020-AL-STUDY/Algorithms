def solution(s):
    answer = ''

    arr = s.split(' ')
    arr = [int(a) for a in arr]

    answer = str(min(arr)) + " " + str(max(arr))

    return answer