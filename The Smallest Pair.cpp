#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int array[n];
        for(int i=0;i<n;i++)
        {
            cin>>array[i];
        }
        sort(array,array+n);
        cout<<array[0]+array[1]<<endl;
    }
	return 0;
}
