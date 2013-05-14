//

#include <iostream>
#include "OrderedPair.h"

using namespace std;
int main(void) {
	OrderedPair op1(6,4);
	OrderedPair op2(-3,5);
	op1.print();	
	op2.print();
	
	
	
	double dist = op1.distance(op2);
	cout<<dist<<endl;
}