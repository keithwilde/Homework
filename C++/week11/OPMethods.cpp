//

#include <iostream>
#include "OrderedPair.h"

using namespace std;
int main(void) {
	OrderedPair op1(6,4);
	OrderedPair op2(-3,5);
	cout<<"The first ordered pair is:";
	op1.print();
	cout<<endl<<"The second ordered pair is: ";
	op2.print();

	cout<<"The result of adding the first to the second is";
	op1.add(op2);
	op1.print();
	
	op1.setX(6);
	op1.setY(4);
	
	cout<<endl<<"The distance between the original two points is ";
	
	double dist = op1.distance(op2);
	cout<<dist<<endl;
}