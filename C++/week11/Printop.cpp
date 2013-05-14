//

#include <iostream>
#include "OrderedPair.h"

using namespace std;
int main(void) {
	OrderedPair op1(6,4);
	OrderedPair op2(-3,5);
	
	
	cout<<"The first ordered pair is ";
	op1.print();
	cout<<endl<<"The second ordered pair is ";
	op2.print();
	
	return 0;
}