//cos, exp, log, pow, sqrt, ceil, floor.

#include <stdio.h>
#include <math.h>	 

int main() {
	printf("cos(PI) = %f\n", cos(3.141592));
	printf("cos(2PI) = %f\n\n", cos(3.141592*2));
	
	printf("The exponential value of 1 is %f\n", exp(1));
	printf("The exponential value of 2 is %f\n\n", exp(2));
	
	printf ("ln(%lf) = %lf\n", 5.5, log(5.5) );
	printf ("ln(%lf) = %lf\n\n", 1.0, log(1.0) );
	
	printf("3^8 = %d\n", (int)pow(3,8));
	printf("2.3^4.5 = %f\n\n", pow(2.3,4.5));
	
	printf("The square root of 25 = %d\n", (int) sqrt(25));
	printf("The square root of 423 = %f\n\n", sqrt(423));
	
	printf ("The ceil of 2.1 is %.1lf\n", ceil (2.1) );
	printf ("The ceil of 5.7 is %.1lf\n\n", ceil (5.7) );
	
	printf ("The floor of 2.1 is %.1lf\n", floor (2.1) );
	printf ("The floor of 5.7 is %.1lf\n", floor (5.7) );
	
	
	
	
	
	
	
	
	}
	
	


	


	