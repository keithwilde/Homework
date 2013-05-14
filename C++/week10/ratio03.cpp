//find a well known library 
#include <iostream>

using namespace std;

class Ratio {
public:
	Ratio(int n = 0, int d = 1) : num(n),den(d) {} //basically giving default value of n = 0, don't need other two now
	
	void print() { cout << num << "/"<<den;}
private:
	int num, den;
};

int main() {
	Ratio x, y(4), z(22,7);
	cout  << "x = ";
	x.print();
	cout <<"\ny = ";
	y.print();
	cout<<"\nz = ";
	z.print();
	
}