#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    void reverseArray(vector<int> &arr)
    {
        int n = arr.size();
        reverse(arr, 0, n - 1);
    }

    void reverse(vector<int> &arr, int start, int end)
    {
        if (start < end)
        {
            swap(arr[start], arr[end]);
            reverse(arr, start + 1, end - 1);
        }
    }
};

int main()
{
    int t;
    cin >> t;
    cin.ignore();
    while (t--)
    {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number)
        {
            arr.push_back(number);
        }

        Solution ob;
        ob.reverseArray(arr);
        for (int i = 0; i < arr.size(); i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
    return 0;
}