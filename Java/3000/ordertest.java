
public class ordertest {
	public static void main(String [] args){
		 
		int mod = 15;
		
		for(int i = 1; i < mod; i++){
			int test = 0;
			int j = 0;
			while(test !=1){
				j++;
				test = (int) (Math.pow(i, j) % mod);
				
			}
			
			
			System.out.println("i = " + i + " order: " + j);
		}
			
		}
	}

