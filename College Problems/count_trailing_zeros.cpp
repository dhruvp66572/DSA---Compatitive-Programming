#include <iostream>

using namespace std;
int main()
{
 long n, current = 5, answer = 0;
 cin >> n;
 while (current <= n) {
 answer =answer + n / current;
 current = current * 5;
 }
 cout << answer << endl;
 return 0;
}
