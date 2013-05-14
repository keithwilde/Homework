//

#include <iostream>
#include <string>
using namespace std;
void swap2 (int & a, int & b) {
	int tmp = a;
	a =b;
	b=tmp;
	
}
int main(){
	string *strPtr;
	
	strPtr = new string("hello");
	cout << "the string is: " << *strPtr << endl;
	*strPtr += " world";
	cout << "Now the string is " << *strPtr << endl;
	int x = 37;
	int y = 52;
	cout << x << " " << y <<endl;
	swap2(x,y);
	cout << x << " " << y << endl;
	
	delete strPtr;

}