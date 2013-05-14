   //excercise 2. output to record.dat 1 2 3 4 5 6 7 8 10
   #include <stdio.h>
   #include <stdlib.h>
   
   int main(void)
   {
      FILE *fp;
      int i;
   
      fp = fopen("record.dat", "w");
     
   
      for (i=1; i<=10; ++i)
         fprintf(fp, "%d ", i);
   
	
   }
