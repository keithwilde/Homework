//

#include <stdio.h>
#define IN 1			//this means inside a word
#define OUT 0			//when outside word
int main() {
	int c;		//current character
	int nl = 0;			//#lines
	int nw = 0;			//#words
	int nc = 0;			//#characters
	int state = OUT;
	
	while ((c = getchar()) != EOF) {
		++nc;
		if (c == '\n') {
			++nl;
		}
		if (c == ' ' || c == '\n' || c == '\t') {
			state = OUT;
		}
		else if (state == OUT) {
			state = IN;
			++nw;
		}
	
	printf("%d %D %D \n", nl,nw,nc);
	
	}
}