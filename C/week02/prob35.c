#include <stdio.h>
#include <math.h>

int f(int a[3][3]);
void printArray(int i, int j, int[i][i]);
int main() {
	int b[3][3] = { 1,2,3,
					4,5,6,
					7,8,9};
	printf("Before transposing: \n");				
	printArray(3,3,b);
	
	f(b);
	printf("After transposing: \n");
	printArray(3,3,b);
	}	
int f(int a[3][3]){
	int temp = a[0][1];
	a[0][1] = a[1][0];
	a[1][0] = temp;
	
	temp = a[0][2];
	a[0][2] = a[2][0];
	a[2][0] = temp;
	
	temp = a[1][2];
	a[1][2] = a[2][1];
	a[2][1] = temp;
	
	return a;
}

void printArray(int i, int j, int a[i][j]){
	int x,y;
	for(x=0; x < i; x++){
		for(y=0; y<j; y++){
			printf("%d ", a[x][y]);
		}
		printf("\n");
	}
}	
