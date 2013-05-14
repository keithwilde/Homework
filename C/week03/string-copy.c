//

#include <stdio.h>

void copy1(char *s1, char *s2);
void copy2(char *s1, char *s2);


int main() {
	char s1[16];
	char *s2 = "Now is the time"; 	//pointer to character, s2 points to N in Now is the ...
	
	char s3[25];
	char s4[] = "for all good programmers";
	
	copy1(s1, s2);
	printf("s1 = %s\n", s1);
	
	copy2(s3, s4);
	printf("s3 = %s\n", s3);
	
	
}

void copy1(char *s1, char *s2) {
	int i;
								// symbol for null is \0 
	for (i = 0; ( s1[i] = s2[i]) != '\0'; i++);		//shorthand
	
	}
	
void copy2(char *s1, char *s2) {
	for (;(*s1 = *s2) != '\0';s1++,s2++){}
	
}