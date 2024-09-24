// Problem - Count the number of digit and each digit is divisible by whole number 

#include <iostream>
using namespace std;

int main()
{
    int count = 0, n;

    cin >> n;

    int digit = 0, num = n;

    while (n > 0)
    {

        digit = n % 10;

        if (digit == 0)
        {
            n = n / 10;
            digit = n % 10;
        }

        cout << "digit" << digit << endl;
        cout << "mod" << num % digit << endl;
        if (num % digit == 0)
        {
            count++;
            cout << count;
        }
        n = n / 10;
    }
    cout << count;

    return 0;
}