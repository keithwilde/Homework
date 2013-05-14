//Week 2 problem 11

#include<stdio.h>
int main() {
	
	int k;
	int i;
	int total;
	printf("Please enter k: \n");
	scanf("%d", &k);
	//printf("%d", k);
	for(i=0; i <k; i +=1){
		total = i + i + 1;
		printf("%d + %d = %d\n", i, i+1, total);
	}
	
}
	
	
	