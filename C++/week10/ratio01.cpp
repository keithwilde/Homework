//constructors

#include <iostream>

using namespace std;

class Ratio {
public:
	Ratio() { num = 0; den = 1; }		//constructor when nothing given
	Ratio(int n) { num = n; den = 1; }
	Ratio(int n, int d) {num = n; den = d; }
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