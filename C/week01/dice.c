// rolling of two dice

#include <stdio.h>
#include <stdlib.h>

void dice (int n);

int main() {
	dice(20);
	
}
void dice (int n){
	
	int i;
	srand(n);
	for(i =1; i <=n; i ++){
		printf("Roll %d : %d  %d \n", i, rand()%6+1, rand()%6 +1);
	}
	}



