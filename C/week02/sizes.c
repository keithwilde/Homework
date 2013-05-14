//

#include <stdio.h>
#include <limits.h>
#include <float.h>		 

int main() {

	
	
	printf("sizeof(char): %d\n", sizeof(char));
	printf("sizeof(int): %d\n", sizeof(int));
	printf("sizeof(unsigned int): %d\n", sizeof(unsigned int));
	printf("sizeof(long long): %d\n", sizeof(long long));
	printf("sizeof(double): %d\n", sizeof(double));
	printf("sizeof(float): %d\n", sizeof(float));
	
	
	
	//find the max and mins of each type
	printf("Max int:  %d\n", INT_MAX);
	printf("Min int: %d\n", INT_MIN);
	
	printf("Max char:  %d\n", CHAR_MAX);
	printf("Min char: %d\n", CHAR_MIN);
	
	printf("Max unsigned int:  %d\n", UINT_MAX);
	printf("Min unsigned int: %d\n", INT_MIN);
	
	printf("Max long long:  %lld\n", LDBL_MAX);
	printf("Min long long: %lld\n", LDBL_MIN);
	
	printf("Max double:  %f\n", DBL_MAX);
	printf("Min double: %f\n", -DBL_MAX);
	
	
	}
	
	


	