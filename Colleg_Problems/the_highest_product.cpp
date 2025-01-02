#include <bits/stdc++.h>
using namespace std;

int gethieghstProduct(vector<int> &nums)
{  double maxi=INT_MIN,p=1,s=1;
        int n=nums.size();
        for(int i=0;i<n;i++){
            p*=nums[i];s*=nums[n-i-1];
            maxi=max(maxi,p);maxi=max(maxi,s);
            if(p==0) p=1;
            if(s==0) s=1;
        }
        return maxi;
}

int main()
{
  int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    
    vector<int> nums(n);
    cout << "Enter the elements: ";
    for(int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    int ans = gethieghstProduct(nums);

    cout << ans << endl;

    return 0;
}