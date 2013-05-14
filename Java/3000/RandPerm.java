import java.util.Random;

/*
 * Empirical Determination of algorithm complexity
RANDOM PERMUTATIONS:
Create a random permutation
[0,1... n-1]
1) start from left side
2)pick a random number k in range 0 => n-1
3)swap a value at index k with the value at index i
4)increase i by 1 and repeat
for n =5, set is {0,1,2,3,4}
 */
public class RandPerm {
	int[] numArray;
	int num = 0;
	public RandPerm(int n){
		num = n;
		numArray = getArray(n);
		swap();
	}
	public  int[] getArray(int n){
		int[] temp = new int[n];
		for(int i =0; i < n; i ++){
			temp[i] = i;
			
		}
		
		return temp;
}	
	public  void  swap(){
		Random rand = new Random();
		int k = 0;
		int temp;
		for(int i =0; i < numArray.length; i ++){
			k = rand.nextInt()%(num);
			if(k <0){
				k = k* (-1);
			}
			temp = numArray[k];
			numArray[k] = numArray[i];
			numArray[i] = temp; 
		}
}
	public static void main(String[] args){
		RandPerm permutation = new RandPerm(10);
	
		
	
	
		for(int i = 0; i <10; i ++){
			System.out.println(permutation.numArray[i]);
		}
		
	}
}