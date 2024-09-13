#include <iostream>
using namespace std;

int main()
{
    int i, j, n;

    // Input number of rows from user
    cin >> n;

    // Print upper part of the arrow
    for (i = 1; i < n; i++)
    {
        // Print trailing (n-rownumber) spaces
        for (j = 1; j <= (n - i); j++)
        {
            cout << " ";
        }

        // Print inverted right triangle
        for (j = i; j <= n; j++)
        {
            cout << "*";
        }

        cout << endl;
    }

    // Print bottom part of the arrow
    for (i = 1; i <= n; i++)
    {
        // Print trailing (rownumber-1) spaces
        for (j = 1; j < i; j++)
        {
            cout << " ";
        }

        // Print the right triangle
        for (j = 1; j <= i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }

    return 0;
}