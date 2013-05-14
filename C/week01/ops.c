//week1 part 2
#include <stdio.h>
int main() {
	//arithmetic operators
	int num1 = 5;
	int num3 = 2;
	int num2 = -8;
	int num4 = 30;
	int num5  = 23455;
	printf("Arithmetic Operators\n");
	printf("%d + %d = %d\n", num1,num2, num1+num2);
	
	printf("%d - %d = %d\n", num1,num2, num1-num2);
	
	printf("%d * %d = %d\n", num1,num2, num1*num2);
	printf("%d / %d = %d\n", num2,num3, num2/num3);
	printf("%d mod %d = %d", num5,num3, num5%num3);
	
	printf("\n\nRelational Operators\n");
	
	printf(" %d < %d returns %d\n", num1,num2,num1<num2);
	printf("%d < %d returns %d\n", num2,num2,num2<num2);
	printf("%d < %d returns %d\n\n", num2,num1,num2<num1);
	
	printf("%d > %d returns %d\n", num4,num2,num4>num2);
	printf("%d > %d returns %d\n", num2,num2,num2>num2);
	printf("%d > %d returns %d\n\n", num2,num4,num2>num4);
	
	
	printf(" %d <= %d returns %d\n", num1,num2,num1<=num2);
	printf("%d <= %d returns %d\n", num2,num2,num2<=num2);
	printf("%d <= %d returns %d\n\n", num2,num1,num2<=num1);
	
	printf(" %d >= %d returns %d\n", num1,num2,num1>=num2);
	printf("%d >= %d returns %d\n", num2,num2,num2>=num2);
	printf("%d >= %d returns %d\n\n", num2,num1,num2>=num1);
	
	printf(" %d == %d returns %d\n", num1,num2,num1==num2);
	printf("%d == %d returns %d\n", num2,num2,num2==num2);
	printf("%d == %d returns %d\n\n", num2,num1,num2==num1);
	
	printf(" %d != %d returns %d\n", num1,num2,num1!=num2);
	printf("%d != %d returns %d\n", num2,num2,num2!=num2);
	printf("%d != %d returns %d\n", num2,num1,num2!=num1);
	
	printf("\nLogical Operators ");
	
	
		
	
}