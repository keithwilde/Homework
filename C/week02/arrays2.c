//passing arrays


#include <stdio.h>

void squareit(int n[], int size);


int main() {
	int n[10] = {10,20,30,40,50,60,70,80,90,100};		//integer array
	int i;
	
	
	squareit(n,10);
	
		
	
	for (i =0; i < 10; i ++){
		printf("%5d\n", n[i]);
		}
		
		
	}
	
	void squareit(int n[], int size){
			int j;
			
			for (j=0; j <size; j++) {
				n[j] = n[j]*n[j];
			}
	}