a, b = map(int, input().split())
c = []
while a != 0 or b != 0:
   c.append(a+b)
   a, b = map(int, input().split())

for i in c:
    print(i)
