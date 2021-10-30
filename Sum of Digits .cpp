#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
	    int x;
	    cin>>x;
	    int sum=0;
	    while(x>0){
	        int id=x%10;
	         sum=sum+id;
	        x/=10;
	    }
	    cout<<sum<<endl;
	}
	return 0;
}
