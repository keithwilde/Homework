//

#include <iostream>
#include "Complex.h"

using namespace std;

int main() {
	Complex z3;
	Complex z1(4.3,8.2);
	Complex z2(3.3,1.1);
	
	cout<< "z1: ";
	z1.print();
	
	cout<< "\nz2: ";
	z2.print();
	

	
	z3 = z1 * z2;
	cout <<"\nz3 = z1 * z3"<<endl<<"z3 = ";
	z3.print();
}