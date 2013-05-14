//chapter 6 problem 14

#include<stdio.h>
double volume(int n);
int main() {
	printf("%1f \n", volume(2));
}

double volume(int n){
	double volume = (4.0/3.0) * 3.141592 * (n * n *n);
	
	return volume;
}
	
	


	


	