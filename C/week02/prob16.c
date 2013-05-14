///chapter 6 problem 16

#include<stdio.h>
int fibonacci(int n);
int main() {
	printf("%d \n", fibonacci(6));
}

int fibonacci(int n){
	
	
	if(n==
	0){
		return 0;
	}
	if(n==1){
		return 1;
	}
	return fibonacci(n-1) + fibonacci(n-2);
	
}
	
	