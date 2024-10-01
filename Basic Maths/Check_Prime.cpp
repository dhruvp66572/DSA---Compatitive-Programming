#include <bits/stdc++.h>
using namespace std;

string checkprime1(int n)
{
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            count++;
        }
    }

    cout<<count<<endl;
    if (count != 2)
    {
        return "NO";
    }

    return "YES";
}

string checkprime2(int n)
{
    int count = 0;
    int sqrtN = sqrt(n);
    for (int i = 1; i <= sqrtN; ++i)
    {        
       if (n % i == 0) { 
           count++;
            if (i != (n/ i)) {
                count++;
            }
            cout<<count<<endl;
        }
    }
    if (count != 2)
    {
        return "NO";
    }

    return "YES";
}

int main()
{
    int n;

    cin >> n;

    // cout << checkprime1(n);
    cout << checkprime2(n);

    return 0;
}