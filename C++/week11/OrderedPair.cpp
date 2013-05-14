//

#include <iostream>
using namespace std;

class OrderedPair {
	private:
		int x;
		int y;
		
	public:
		OrderedPair() {
			x = 0;
			y = 0;
		}
		OrderedPair(int x1, int y1) {
			x = x1;
			y = y1;
		}
		int getX(){
			return x;
		}
		int getY(){
			return y;
		}
		int setX(int x1){
			x = x1;
		}
		int setY(int y1){
			y = y1;
		}
};									//semicolon needed after class definition

int main(void) {
	OrderedPair op1;
	OrderedPair op2(3,4);
	
	cout<< "The first ordered pair: (" << op1.getX()<< ","<<op1.getY()<< ")" << endl;
	cout << "The second ordered pair: ("<<op2.getX()<< ","<<op2.getY()<<")" << endl;
}