//File I/O

#include <stdio.h>

int main () {
		FILE *fpt;	
		fpt = fopen ("awmt.txt", "r");	
		char text[100];
		int i, where;
		
		//below is an iterator
		for (i = 1; i  <= 100; i ++){
			fscanf(fpt, "%s\n", text);
			printf("%s \n", text);
			where = ftell(fpt);
			printf("Location of file pointer = %d\n",where);
		}
		fseek(fpt, 1000, SEEK_CUR);
		
		for (i = 1; i  <= 100; i ++){
			fscanf(fpt, "%s\n", text);
			printf("%s \n", text);
			where = ftell(fpt);
			printf("Location of file pointer = %d\n",where);
		}

}	
