//Reads from record.dat and prints contents
#include <stdio.h>

int main () {
		FILE *fpt;	//file keyword and pointer to a file
		fpt = fopen ("record.dat", "r");	//file name and mode
		int text[21];
		
		fread(text, 1, 21, fpt);	//file to put into, beginning byte, ending byte, where stored?, returns number of bytes read
		printf("%s\n", text);
			
}	
