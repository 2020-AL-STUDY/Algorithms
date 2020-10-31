N = int(input())

returnValue = 666
count = 0
while True:
    if '666' in str(returnValue):
        count += 1
    if count == N: break
    returnValue += 1

print(returnValue)