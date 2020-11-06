import sys

x = int(sys.stdin.readline()) #입력

money = [-1 for i in range(100001)] #주어진 n의 범위인 100001개 만큼의 배열 생성(0 제외하고는 100000개)
money[2]=1
money[4]=2
money[5]=1

for i in range(6,x+1):
    if money[i-2]!=-1 and money[i-5]!=-1:
        money[i] = min(money[i - 2] + 1, money[i - 5] + 1)
    else:
        if money[i-2] == -1:
            money[i] = money[i-5]+1
        if money[i-5] == -1:
            money[i] = money[i-2]+1

    print(i)




print(money[x])






