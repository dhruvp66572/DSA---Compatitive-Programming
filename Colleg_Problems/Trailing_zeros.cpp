// count the number of trailing zeros in Value

#include <iostream>
using namespace std;

int main()
{
    long n, current = 5, answer = 0, count;
    cout<<"Enter Number :: ";
    cin >> n;

    while (current <= n)
    {
        answer = answer + n / current;
        current = count * 5;
    }
    cout << "Number of Zeros " <<answer << endl;
    return 0;
}