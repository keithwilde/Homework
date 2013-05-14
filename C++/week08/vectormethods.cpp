// demonstrates vector methods capacity, clear, front, insert, pop_back and size

#include <iostream>
#include <vector>
using namespace std;

int main() {
	
	cout<< "Putting integers 0 to 25 in vector"<<endl ;
	vector<int> vect;
	 
	for(int i = 0; i < 26; i ++) {
		vect.push_back(i);
	}
	cout << "Contents of vector" <<endl;
	for(int i = 0; i < vect.size(); i ++) {
		cout<< vect[i]<<endl;
	}
	
	cout<<"Capacity method:"<<endl;
	cout<<"vect.capacity() = "<<vect.capacity()<<endl;
	
	cout<<endl<<"Clear method:"<<endl;
	vect.clear();
	cout<<"Vect contents now:"<<endl;
	for(int i = 0; i < vect.size(); i ++) {
		cout<< vect[i]<<endl;
	}
	
	int insertArray [] = {2, 34, -2, 43};
	cout<<endl<<"Insert Method: "<<endl;
	vect.insert(vect.begin(), insertArray, insertArray +3);
	cout<<"vect.insert(vect.begin(), insertArray, insertArray +3)"<<endl;
	cout<<"vect now contains: "<<endl;
	for(int i = 0; i < vect.size(); i ++) {
		cout<< vect[i]<<endl;
	}
	
	cout<<endl<<"pop_back method:"<<endl;
	vect.pop_back();
	cout<<"After vect.pop_back() vect contains:"<<endl;
	for(int i = 0; i < vect.size(); i ++) {
		cout<< vect[i]<<endl;
	}
	
	cout<<"Size method"<<endl;
	cout<<"vect.size() = "<<vect.size()<<endl;
	
	
	
	
	
	
	
	
}