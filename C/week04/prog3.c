#include <stdio.h>
#include <string.h>

int main () {		
	char string[] = "805-435-6212";
	char *tokenptr;							//using ptr makes it easier to follow
	
	printf("%s\n%s\n%s\n", "The string to be tokenized is: ", string, 
			"The tokens are: ");
			
	tokenptr = strtok(string, "-");			//string tokenizer, returns an address
	printf("The area code is: %s\n", tokenptr);
	tokenptr = strtok(NULL, " ");
	printf("The prefix and exchange are : %s", tokenptr);
	
	}

