#include <bits/stdc++.h>
using namespace std;

void pattern1(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << "* ";
        }
        cout << endl;
    }
}

void pattern2(int n)
{
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << "* ";
        }
        cout << endl;
    }
}

void pattern3(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << j << " ";
        }
        cout << endl;
    }
}

void pattern4(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << i << " ";
        }
        cout << endl;
    }
}

void pattern5(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i + 1; j++)
        {
            cout << "*" << " ";
        }
        cout << endl;
    }
}

void pattern6(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i + 1; j++)
        {
            cout << j << " ";
        }
        cout << endl;
    }
}

void pattern7(int n)
{
    for (int i = 0; i < n; i++)
    {
        // space
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        // start
        for (int j = 0; j < 2 * i + 1; j++)
        {
            cout << "*";
        }
        // space
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        cout << endl;
    }
}

void pattern8(int n)
{
    for (int i = 0; i < n; i++)
    {
        // space
        for (int j = 0; j < i; j++)
        {
            cout << " ";
        }
        // start
        for (int j = 0; j < (2 * n - (2 * i + 1)); j++)
        {
            cout << "*";
        }
        // space
        for (int j = 0; j < i; j++)
        {
            cout << " ";
        }
        cout << endl;
    }
}

void pattern10(int n)
{
    for (int i = 0; i <= (2 * n - 1); i++)
    {
        // start
        int stars = i;
        if (i > n)
        {
            stars = 2 * n - i;
        }

        for (int j = 0; j <= stars; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void pattern11(int n)
{
    for (int i = 0; i < n; i++)
    {
        int starts;
        if (i % 2 == 0)
        {
            starts = 1;
        }
        else
        {
            starts = 0;
        }

        for (int j = 0; j <= i; j++)
        {
            cout << starts << " ";
            starts = 1 - starts;
        }
        cout << endl;
    }
}

// Pending
void pattern12(int n)
{
    for (int i = 1; i <= n; i++)
    {
        // space
        for (int j = 1; j <= i; j++)
        {
            cout << j;
        }
        // start
        for (int j = 0; j < (2 * n - (2 * i + 1)); j++)
        {
            cout << " ";
        }
        // space
        for (int j = 1; j <= i; j++)
        {
            cout << j;
        }
        cout << endl;
    }

    // Secound Pattern

    // 1       1
    // 12     21
    // 123   321
    // 1234 4321

    // for (int i = 1; i < n; i++)
    // {
    //     // space
    //     for (int j = 1; j <= i; j++)
    //     {
    //         cout << j;
    //     }
    //     // start
    //     for (int j = 0; j < (2 * n - (2 * i + 1)); j++)
    //     {
    //         cout << " ";
    //     }
    //     // space
    //     for (int j = i; j >= 1; j--)
    //     {
    //         cout << j;
    //     }
    //     cout << endl;
    // }
}

void pattern13(int n)
{
    int count = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << count << " ";
            count++;
        }
        cout << endl;
    }
}

void pattern14(int n)
{
    char y;
    for (int i = 0; i < n; i++)
    {
        for (int j = 65; j <= i + 65; j++)
        {
            char y = j;
            cout << y << " ";
        }
        cout << endl;
    }
}

void pattern15(int n)
{
    char y;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 65; j <= n - i + 65; j++)
        {
            char y = j;
            cout << y << " ";
        }
        cout << endl;
    }
}

// pattern18 is pending...

void pattern19(int n)
{
    int initSpace = 0;
    for (int i = 0; i < n; i++)
    {
        // starts
        for (int j = 1; j <= n - i; j++)
        {
            cout << "* ";
        }

        // space
        for (int j = 0; j < initSpace; j++)
        {
            cout << " ";
        }

        // starts
        for (int j = 1; j <= n - i; j++)
        {
            cout << "* ";
        }

        initSpace += 2;
        cout << endl;
    }
    initSpace = 8;
    for (int i = 1; i <= n; i++)
    {
        // starts
        for (int j = 1; j <= i; j++)
        {
            cout << "* ";
        }

        // space
        for (int j = 0; j < initSpace; j++)
        {
            cout << " ";
        }

        // starts
        for (int j = 1; j <= i; j++)
        {
            cout << "* ";
        }

        initSpace -= 2;
        cout << endl;
    }
}

void pattern20(int n)
{
    int space = 2 * n - 2;
    for (int i = 1; i <= 2 * n - 1; i++)
    {
        int stars = i;
        if (i > n)
        {
            stars = 2 * n - i;
        }

        // stars
        for (int j = 1; j <= stars; j++)
        {
            cout << "*";
        }

        // spaces
        for (int j = 1; j <= space; j++)
        {
            cout << " ";
        }

        // stars
        for (int j = 1; j <= stars; j++)
        {
            cout << "*";
        }
        cout << endl;
        if (i < n)
        {
            space -= 2;
        }
        else
        {
            space += 2;
        }
    }
}

void pattern21(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
            {
                cout << "*";
            }
            else
            {
                cout << " ";
            }
        }
        cout << endl;
    }
}

void pattern22(int n)
{
    for (int i = 0; i < 2*n-1; i++)
    {
        for (int j = 0; j < 2*n-1; j++)
        {
            int top = i;
            int left = j;
            int right = (2*n - 2) - j;
            int down = (2*n - 2) - i;

            cout << (n-min(min(top,down), min(left,right)));
        }
        cout << endl;
    }
}

int main()
{
    int t;
    cin >> t;

    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;

        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        // pattern18(n);
        // pattern19(n);
        // pattern20(n);

    }

    return 0;
}