//

#include <stdio.h>


int main() {
	char c[5] = "now ";
	int i;
	
	//The interesting properties of array addresses  
	printf("%p \n", &c);		
	printf("%p \n", c);			//when you give array you give the contents and pointer
	printf("%c \n", *c);
	printf("%p \n", &c[2]);
	printf("%c \n", c[2]);

	
	
	c[2] = 'z';
	printf("%s \n",c);
	
	printf("%c \n",c[4]);
	c[4] = '$';
	
	printf("%s \n",c);
	
	printf("%c \n",c[7]);
	
	for(i=7; i <= 10000; i ++){
		printf("%c", c[i]);
	}
	
	}
	
	