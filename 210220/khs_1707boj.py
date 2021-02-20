#include <iostream>
#include <vector>

using namespace std;

int check[200001];
vector<int> a[200001];


void dfs(int node, int c){
    check[node] = c;
    for(int i=0;i<a[node].size();i++){
        int next = a[node][i];
        if(check[next]==0){
            dfs(next, 3-c);
        }
    }
}


int main(){
    int k = 0;
    
    cin >> k;
    for(int i=0;i<k;i++){
        int n = 0, m = 0;
        cin >> n >> m;
        for(int i=1;i<=n;i++){
            a[i].clear();
            check[i] = 0;
        }
        
        for(int i=1;i<=m;i++){
            int u, v;
            cin >> u >> v;
            a[u].push_back(v);
            a[v].push_back(u);
        }
        
        for(int i=1;i<=n;i++){
            if(check[i] == 0){
                dfs(i, 1);
            }
        }
        
        bool ok = true;
        for(int i=1;i<=n;i++){
            for(int k=0;k<a[i].size();k++){
                int j = a[i][k];
                if(check[i] == check[j]){
                    ok = false;
                }
            }
        }
        
        if(ok){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
        
    }
    
    return 0;
    
}
