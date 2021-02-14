import sys

def gcd(a, b):
    while b!=0:
        a,b = b, a%b
    return aac


N = int(sys.stdin.readline())
r_list = list(map(int, sys.stdin.readline().split()))
r2_list = r_list[1:N]
first_ring= r_list[0]

for i in range(len(r2_list)):
    tmp = r2_list[i]
    gcd_val = gcd(tmp,first_ring)
    ans = str(first_ring// gcd_val) + '/' +  str(tmp//gcd_val)
    print(ans)


