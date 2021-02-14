def solution(nums):
    N = len(nums)
    ava = N // 2
    nums = list(set(nums))
    N = len(nums)

    if ava < N:
        return ava

    return N