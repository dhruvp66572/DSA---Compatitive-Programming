#include <iostream>
using namespace std;

int main()
{
    char s[1000000];
    cin >> s;

    int count = 1, max_count = 1;

    for (int i = 1; s[i] != '\0'; i++)
    {
        if (s[i] == s[i - 1])
        {
            count++;
            max_count = max(max_count, count);
        }
        else
        {
            count = 1;
        }
    }

    cout << max_count << endl;
    
    return 0;
}