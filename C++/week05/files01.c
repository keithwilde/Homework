//File I/O

#include <stdio.h>

int main () {
		FILE *fpt;	//file keyword and pointer to a file
		fpt = fopen ("awmt.txt", "r");	//file name and mode
		char text[50000];
		
		fread(text, 1, 50000, fpt);	//file to put into, beginning byte, ending byte, where stored?, returns number of bytes read
		printf("%s\n", text);
			
}	