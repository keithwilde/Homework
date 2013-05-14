import java.util.*;
import java.applet.Applet;


public class GCD extends Applet{
	


	public static void main(String[] args){
		System.out.println(test());
	}
	public static String test(){
		
		String result = "";
		for(int i = 5; i<=25; i++){
			result += "For n=" + i +": " + gcd(i) + "\n";
		}
		return result;
	}
	
	public static String gcd(int n){
		ArrayList<Integer> set = new ArrayList<Integer>(); 
		
		for(int i =1; i < n; i ++){
			if(euclid(i,n) == 1){
				set.add(i);
			}
		}
		return set.toString() + " Size = " + set.size();
	}

	
	public static int euclid(int n, int m){
		if (m == 0){
			return n;
		}
		return euclid(m,n%m);
	}

}
