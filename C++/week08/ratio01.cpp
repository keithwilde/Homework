//

#include <iostream>
#include <string>
using namespace std;

class Ratio {			//in this case this is basically the interface,usually how things done in cpp

public: 
	void assign(int , int);
	double convert();
	void invert();
	void print();
private:
	int num;
	int den;
	
};

int main(){
	Ratio x;
	x.assign(22,7);
	cout << "x = ";
	x.print();
	cout << " = " << x.convert() << endl;
	x.invert();
	
	cout << "1/x = ";
	
	x.print();
	cout << endl;
}

void Ratio::assign(int numerator, int denominator) {
	num = numerator;
	den = denominator;	
}

double Ratio::convert(){
	return double(num)/den;
}

void Ratio::invert() {
	int temp = num;
	num = den;
	den = temp;
}

void Ratio::print() {
	cout << num << '/' << den;
}
