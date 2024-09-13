#include <iostream>
#include <string>
using namespace std;

bool areIsomers(string s, string t)
{
    int c = 0;
    if (s.length() == t.length())
    {
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i+1; j < t.length(); j++)
            {
                if (s[i] == s[i + 1] && t[i] == t[i + 1] )
                {
                    c++;
                }
            }
        }
        if (c == s.length())
        {
            return true;
        }
    }

    return false;
}

int main()
{
    string s, t;
    cin >> s >> t;

    if (areIsomers(s, t))
    {
        cout << "true" << endl;
    }
    else
    {
        cout << "false" << endl;
    }

    return 0;
}