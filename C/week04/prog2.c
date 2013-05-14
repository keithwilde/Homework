#include <stdio.h>
#include <string.h>

int main () {		
	char x[] = "Now is the time";
	char y[80];
	
	printf("%s%s\n", "The string array x is: ", x);
	printf("%s%s\n", "The string array y is: ", strcpy(y,x));
	
	
}

