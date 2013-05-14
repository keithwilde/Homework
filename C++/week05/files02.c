//File I/O

#include <stdio.h>

int main () {
		FILE *fpt;	
		fpt = fopen ("awmt.txt", "r");	
		char text[50000];
		int bytes_read;
		bytes_read = fread(text, 1, 50000, fpt);	
		printf("%s\n", text);
		printf("Number of bytes read = %d \n", bytes_read);
			
}	