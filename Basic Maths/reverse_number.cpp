// Problem - Reverse number of given number

#include <bits/stdc++.h>
using namespace std;

int main()
{
         long count = 0, n;

    cin >> n;

    long long digit = 0, rev = 0;

    while (n != 0)
    {

        digit = n % 10; // 1
        rev = (rev*10)+digit; //1321
        // Check if rev exceeds 32-bit signed integer range
            if (rev > INT_MAX || rev < INT_MIN) {
                return 0;  // Return 0 in case of overflow
            }
        n = n / 10; //0
    }
    cout << rev;

    return 0;
}