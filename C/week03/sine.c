//

#include <stdio.h>
#include <math.h>

int main() {
	double theta;
	
	for (theta = 0; theta <= 2*M_PI; theta += 0.1) {
		printf("%f\n", sin(theta));
		}
		
		}