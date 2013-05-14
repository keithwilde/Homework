// how to write a function

#include <stdio.h>

int cube(int y);		//function prototype

int main() {
	int n;
	

	for (n =1; n <= 10; n ++) {
		printf("%d\ , cube(n));
		
	}
}

int cube(int m) {
	return m*m*m;
}