//prints out the powers of 2 from 2^1 to 2^20

#include<stdio.h>
#include<math.h>


int main() {
	int i;
	
	for(i=1; i <=20 ;i++){
			
		printf("2 ^%d = %d\n", i,(int)pow(2,i));
	}
	
}
	
	
