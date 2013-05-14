

//reads an input file and counts the number of times each ascii character appears
#include <stdio.h>
#include <string.h>
int main () {
		int i;
		FILE *fpt;	
		fpt = fopen ("awmt.txt", "r");	
		char text[50000];
		int count[128] ={0};
			
		
		
		
		for(i =0; i < strlen(text); i++ ){
			printf("%d\n", (int)text[i]);
			count[(int)text[i]]++;
			
		}
		
		for(i=0; i < 128; i++){
			printf("%c  %d \n",i, count[i]);
		}
		}
			
		
