//test sine function
#include <stdio.h>
#include <math.h>

#define PI 3.14159265
void sine (int n);
int main() {
	
	sine(2);
}

void sine (int n) {
	int i;
	double j = 2*PI /n;
	while(j <= 2*PI){
			printf("sin( %f ) = %f\n", j, sin(j));
			j = 2*j;
	}
	}
