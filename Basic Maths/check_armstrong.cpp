// Problem - Armstrong Numbers

#include <bits/stdc++.h>
using namespace std;

string Armstrong(int n)
{
    int digit = 0, ans = 0, original;
    int count = to_string(n).length();
    original = n;
    while (n != 0)
    {
        digit = n % 10;
        ans += pow(digit, count);
        n = n / 10;
    }

    if (ans == original)
    {
        return "true";
    }
    else
    {
        return "false";
    }
}

int main()
{
    int n;

    cin >> n;

    cout << Armstrong(n);

    return 0;
}