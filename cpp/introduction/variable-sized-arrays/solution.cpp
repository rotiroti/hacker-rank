#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q, k, value, a_i, k_j;

    cin >> n >> q;
    
    vector<vector<int>> a;
    
    for (int i = 0; i < n; ++i) {
        cin >> k;
        
        vector<int> ai_vec;
        
        for (int j = 0; j < k; ++j) {
            cin >> value;
            ai_vec.push_back(value);
        }
        a.push_back(ai_vec);
    }
    
    for (int q_i = 0; q_i < q; ++q_i) {
        cin >> a_i >> k_j;
        cout << a[a_i][k_j] << endl;
    }
    return 0;
}