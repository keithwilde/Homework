import java.applet.Applet;

public class fermat {
	public static void main(String[] args){
		int count =0;
		for(int i = 5; i <= 1000; i ++){
			//for n = i
			
			for(int j = 1; j <i; j ++){
				int test =(int) (Math.pow(j, (i-1)) % i);
					if(test ==1){
						count++;
					}
					else{
						
					}
			}
		}
	}
}
