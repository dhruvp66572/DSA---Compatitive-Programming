#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long n, ans;

    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        ans = (i * i) + ((i + 1) * (i + 1));
        // for (int  j = ; j <=  n; j++)
        // {
        // }
        if (ans = n)
        {
            cout << "true";
            break;
        }
        else
        {
            cout <<"false";
        }
    }

    return 0;
}