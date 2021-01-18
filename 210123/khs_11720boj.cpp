
#include <iostream>
#include <cstdio>

using namespace std;

int main(int argc, const char * argv[]) {
    // insert code here...
    
    int k=0;
    int tmp=0;
    int N = 0;
    cin >> N;
    while(N--){
        scanf("%1d", &k);
        tmp+=k;
    }
    cout << tmp;
    
    return 0;
}
