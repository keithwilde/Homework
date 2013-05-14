#ifndef _ORDEREDPAIR_H				
#define _ORDEREDPAIR_H				
#include <iostream>
#include <math.h>

void printPair();
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
		void print() {
			cout<< "("<<x<<","<<y<<")"<<endl;
		}
		void add(OrderedPair op){
			setX(x+op.getX());
			setY(y+op.getY());
		}
		double distance(OrderedPair op){
			double temp = sqrt(pow(op.getX() - x,2) + (pow(op.getY() - y,2)));
			return temp;
		}
	
};									//semicolon needed after class definition

#endif