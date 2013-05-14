//

#include <stdio.h>
#include <limits.h>		//contains INT_MAX 

int main() {
	char ch = '$';
	int n =5;
	unsigned int m =37;
	long long k = 123456789;
	double t = 3.14159;
	char *str = "now is the time";		//strings are basically character arrays in c, difficult to deal with
	printf("character: %c\n", ch);
	printf("int: %d\n", n);
	printf("unsigned int: %u\n", m);
	printf("long long: %lld\n", k);
	printf("double: %f\n", t);
	printf("string: %s\n", str);
	
	//find the size of all the other types
	printf("sizeof(long long): %d\n", sizeof(long long));
	
	//find the max and mins of each type
	printf("INT_MAX:  %d\n", INT_MAX);
	
	printf("INT_MIN: %d\n", INT_MIN);
	}
	
	