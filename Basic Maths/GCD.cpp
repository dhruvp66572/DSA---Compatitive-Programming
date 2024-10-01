//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
    vector<long long> lcmAndGcd(long long a, long long b)
    {
        long long gcd;
        long long originalA = a;
        long long originalB = b;

        while (a > 0 && b > 0)
        {
            if (a > b)
            {
                a = a % b;
            }
            else
            {
                b = b % a;
            }
        }

        if (a == 0)
        {
            gcd = b;
        }
        else
        {
            gcd = a;
        }
        // LCM is calculated as (a * b) / GCD
        long long lcm = (originalA * originalB) / gcd;

        // Return both LCM and GCD
        return {lcm, gcd};
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long A, B;

        cin >> A >> B;

        Solution ob;
        vector<long long> ans = ob.lcmAndGcd(A, B);
        cout << ans[0] << " " << ans[1] << endl;
    }
    return 0;
}
// } Driver Code Ends