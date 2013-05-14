//

#include <iostream>
using namespace std;


int max(int a, int b);

int main() {
	int x =1;
	int y =1111;
	
	cout << "x = " << x << endl;
	cout << "y = " << y << endl;
	cout << "Max is " << max(x,y) << endl;
}

int max(int a, int b) {
	if (a >= b) {
		return a;
	}
	else {
		return b;
	}
	
}