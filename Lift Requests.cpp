#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t; cin>>t;
	
	while(t--){
	    long long n,q; cin>>n>>q;
	    
	    long long temp[2*q]={0}, ans=0;
	    for(long long i=0; i<2*q; i+=2){
	        cin>>temp[i]>>temp[i+1];
	    }
	    
	    ans = temp[0];
	    for(long long i=0; i<2*q-1; i++){
	        ans += abs(temp[i]-temp[i+1]);
	    }
	    
	    cout<<ans<<endl;
	}
	return 0;
}
