//tests if a number is even or odd
#include <stdio.h>

void even_odd(int n);

int main() {
	even_odd(2);
	even_odd(25);
	even_odd(22);
	even_odd(3);
	
}

void even_odd (int n) {
	if (n %2 == 1) {
		printf("%d is odd\n", n);
	}
	else {
		printf("%d is even\n", n);
	}
}
