#include <stdio.h>


int main() {
	char *s = "Hello"; 
	int i;
	
	for(i = 0; i < 1005; i++){
		printf("%c\t", *s);
		s = s+ sizeof(char);
	}
}
