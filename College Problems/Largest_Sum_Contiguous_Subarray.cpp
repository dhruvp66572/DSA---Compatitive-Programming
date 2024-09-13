#include <bits/stdc++.h>
using namespace std;

int getLargestSum(int arr[], int n)
{
    if (n <= 0)
    {
        return INT_MIN; // Indicates invalid input
    }

    int maxSum = INT_MIN;

    // Brute force approach
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            int sum = 0;
            for (int k = i; k <= j; k++)
            {
                sum += arr[k];
            }
            maxSum = max(maxSum, sum);
        }
    }

    return maxSum;
}

int main()
{
    int n;
    cin >> n;

    if (n <= 0)
    {
        cout << "Invalid Input" << endl;
        return 0;
    }

    int arr[n];

    // Input array
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // Function call
    int ans = getLargestSum(arr, n);

    if (ans == INT_MIN || ans < 0){
        cout << "Invalid Input" << endl;
    } else {
        cout << ans << endl;
    }

    return 0;
}
