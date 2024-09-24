// Problem - Check Palimdrom or Not.

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long count = 0, n;

    cin >> n;

    long long digit = 0, rev = 0, old;

    old = n;
    while (n != 0)
    {
        digit = n % 10;
        rev = (rev * 10) + digit;
        n = n / 10;

        // Check if rev exceeds 32-bit signed integer range
        if (rev > INT_MAX || rev < INT_MIN)
        {
            return 0; // Return 0 in case of overflow
        }

    }
    cout << rev;
    if (old == static_cast<int>(rev) && rev >= 0 )
    {
        cout << "true";
    }
    else
    {
        cout << "false";
    }
    // Cast back to int

    return 0;
}