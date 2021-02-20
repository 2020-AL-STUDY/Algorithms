
firstNum = int(input())
temp = 0
cnt = 0
if firstNum/10 == 0:
    temp = str(firstNum)+str(firstNum)
    # print(temp)
    cnt = cnt+1
else:
    mok, rest = divmod(int(firstNum), 10)
    last = int(mok)+int(rest)
    # print(last)
    if last >= 10:
        last = last % 10
        # print(last)
    temp = str(rest)+str(last)
    # print(temp)
    cnt = cnt+1

while int(firstNum) != int(temp):
    if int(temp)/10 == 0:
        temp = str(temp)+str(temp)
        # print(temp)
        cnt = cnt+1
    else:
        mok, rest = divmod(int(temp), 10)
        last = int(mok)+int(rest)
        # print(last)
        if last >= 10:
            last = last % 10
            # print(last)
        temp = str(rest)+str(last)
        # print(temp)
        cnt = cnt+1
print(cnt)