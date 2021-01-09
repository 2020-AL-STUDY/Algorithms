import sys

def check_if_group(str):
    flag = True
    checklist = []
    checklist.append(str[0])

    for char in str:
        ch = checklist[-1]
        if char not in checklist:
            checklist.append(char)
        else:
            if ch != char:
                flag = False
                break
    return flag

N = int(sys.stdin.readline())

tmp = 0
for i in range(N):
    if(check_if_group(sys.stdin.readline())):
        tmp+=1

print(tmp)

