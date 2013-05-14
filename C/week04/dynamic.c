// Dynamic memory allocation 
// malloc: sets aside the amount of memory you request 
// then returns a "void pointer". You must cast the pointer to the correct type

#include <stdio.h>
#include <stdlib.h>

int main () {
	int n;
	int i; 
	int *a;
	
	printf("Enter the size of the array: ");
	scanf("%d", &n);
	a = (int *) malloc(n * sizeof(int));		//sets aside n times the number of bytes needed for int. This line uses casting
	printf("Enter %d numbers: \n", n);
	
	for (i =0; i < n; i++) {
		scanf("%d", a+i);			//pointer arithmetic
	}
	
	printf("Here are the same numbers in reverse order: \n");
	for (i = n-1; i >= 0; i--) {
		printf("%d \n", a[i]);
		
	}
	
	
	}

