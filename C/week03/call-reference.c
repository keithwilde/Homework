// call by value vs call by reference

#include <stdio.h>

void cubeByValue(int n);
void cubeByReference(int *iptr);	//pointer for an integer is what *iptr is 

int main(void) {
	int n = 10;
	int *bogus = 0x28FF10;
	printf("%p\n",bogus);
	printf("%d\n",*bogus);
	
	printf("The original value of n is %d\n", n);
	cubeByValue(n);
	printf("The value of n after the call is %d\n",n);
	cubeByReference(&n);		// &n means address of n
	
	printf("The value of n after the call is %d\n",n);
	
	return 0;
	}
	
void cubeByValue(int n) {
	n = n*n*n;
	printf("Input is cubed %d\n",n);
}

void cubeByReference(int *iptr) {		//dereferencing operator, we get passed a pointer to n, 
						//	^ This is an address (Iptr is an address)
	*iptr = (*iptr)*(*iptr)*(*iptr);	//puts result into location
	//							^This is the first thing evaluated
	//							^*iptr is the value in the address given by iptr
	//^ go to address
	printf("%p\n",iptr);
	printf("input cubed is %d\n", *iptr);
	
	}
	
	