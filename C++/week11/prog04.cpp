//vectors and iterators

#include <iostream>
#include <vector>
using namespace std;
//:: is scope specifier
typedef vector<int>::iterator It;		//iterators are pointers in c++
int main() {
	vector<int> v(11);
	
	for(int i = 0; i <= 10; i++){
		v[i] = i*i;
	}
	cout << "Using the iterator It in a loop:\n";
	
	for(It it = v.begin(); it != v.end(); it++) {
		cout << *it<<endl;
	}
	cout << "Using iterator it in a while loop"<<endl;
	It p = v.begin();
	while( p != v.end()){
		cout<< *p++<<endl;		//post increment, prints what p is pointing to, then increments p
	}
	}		
