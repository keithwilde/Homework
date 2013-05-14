import java.applet.Applet;
import java.math.*;
import java.util.ArrayList;

public class euler extends Applet {
	
	
	public static void main(String[] args){
		System.out.println(eulerTest());
	}
	public static String eulerTest(){	
		String result = "For all a in Zn* a^(phi(n))modn = 1";
		for(int i = 5; i <= 10; i ++){
			int phi = phi(i);
			int test = 0;
			for(int j = 1; j <i; j++){
				if(gcd(j,i)==1){
					test = ((int) Math.pow(j, phi)) % i;
					if(test !=1){
						result += "For set" + i + " " + j + "^" + phi%i + " = " + test + "\n";
					}
				}
			}
			
		}
	return result;
	}	
	
	public static int phi(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<n; i++){
			if(gcd(i,n) ==1){
				list.add(i);
			}
		}
		
		return list.size();
	}
	public static int gcd(int n, int m){
		if (m == 0){
			return n;
		}
		return gcd(m,n%m);
	}
}
