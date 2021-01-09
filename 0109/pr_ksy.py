def solution(n, times):
    answer = 0

    times.sort()
    low = 1
    high = int(times[len(times) - 1] * n)

    while low < high:
        sum = 0
        mid = int((low + high) / 2)

        for i in range(len(times)):
            sum += int (mid / times[i])

        if sum >= n:
            high = mid
        else:
            low = mid + 1

    answer = high

    return answer

print(solution(8, [5,7,8,10]))