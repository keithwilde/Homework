//Week 2 problem 19

#include<stdio.h>
int main() {
	int num;
	char letter;
	
	
	printf("Enter an integer 0-255: \n");
	scanf("%d",&num);
	
	
	
	if(num >255 || num < -1){
		printf("Please enter number in range 0-255\n");
		scanf("%d", &num);
	}
	else if(num == -1){
		return 0;
	}
	else{
		letter = (char)num;
		printf("The character is: %c \n", letter);
	}	
	
	

}
	
	