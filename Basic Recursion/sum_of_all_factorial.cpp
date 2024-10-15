#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
        // Recursive helper function to find factorial numbers
        void generateFactorials(long long n, long long fact, int i, vector<long long> &result) {
            if (fact > n) return;  // Base case: stop if factorial exceeds n
            
            result.push_back(fact); // Add the current factorial to the result vector
            generateFactorials(n, fact * (i + 1), i + 1, result); // Recursive call for next factorial
        }

        vector<long long> factorialNumbers(long long n) {
            vector<long long> result;
            generateFactorials(n, 1, 1, result); // Start recursion with fact = 1 and i = 1
            return result;
        }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        long long N;
        cin >> N;
        Solution ob;
        vector<long long> ans = ob.factorialNumbers(N);
        for (auto num : ans) {
            cout << num << " ";
        }
        cout << endl;
    }
    return 0;
}
