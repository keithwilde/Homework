// Dynamic memory allocation 


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//returns pointer to character, takes pointer to a character
char * strcopy(char *dp, char *sp) {
	while (*sp != '\0') {
		*dp++ = *sp++;
	}
	*dp = '\0';
	
	return dp;	//returning a character pointer 
}	
	
int main () {
	char *src = "now is the time";
	char *dest;
	
	printf("source = %s \n", src);
	
	
	dest = (char *) malloc(sizeof(char)*strlen(src) + 1);	//adding 1 because of null character
	strcopy(dest,src);
	printf("destination = %s\n", dest);
	
	free(dest);
	
	
	
	}

