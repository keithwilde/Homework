//function that finds distance between two points
#include <stdio.h>
#include <math.h>

double distance(int x1 ,int y1, int x2, int y2);

int main() {
	printf("%f",distance(-2,-3,-4,4));
	
}

double distance (int x1 ,int y1, int x2, int y2) {
	return sqrt(pow((x2-x1),2) + pow((y2-y1), 2));
}
