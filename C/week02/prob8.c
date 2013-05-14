//chapter 7 problem 8

#include<stdio.h>
#define AREA(x) 3.141592 * x * x
#define CIRC(y) (3.141592 * 2 * y)

	


int main() {
	int r;
	printf("Enter the radius of a disc: ");
	
	scanf("%d", &r);
	
	
	double area = AREA(r);
	
	printf("The area of the disc is : %1f ",area);
	double circ = CIRC(r);
	
	printf("\nThe circumference of the disc is: %1f", circ);
	
}
	
	