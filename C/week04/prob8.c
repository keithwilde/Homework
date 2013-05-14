#include <stdio.h>

int compare(double a[], double b[], int npts);
int main() {
	int a[] = {1,2,3,4};
	int b[] = {1,3,4,5};
	
	printf("Compare(a,a) = %d", compare(a,a, 4));
	printf("\ncompare(a,b) = %d", compare(a,b, 4));
	}	
int compare(double a[], double b[], int npts){
	int i;
	for(i =0; i < npts; i ++) {
		if(a[i] != b[i]){
			return 0;
		}
	return 1;	
	}
}	
