//

#include <iostream>
using namespace std;
void swap2 (int & a, int & b) {
	int tmp = a;
	a =b;
	b=tmp;
	
}
int main(){
	int x = 37;
	int y = 52;
	cout << x << " " << y <<endl;
	swap2(x,y);
	cout << x << " " << y << endl;

}