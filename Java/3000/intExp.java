import java.applet.Applet;
import java.math.BigInteger;
public class intExp extends Applet{
	public static void main(String[] args){	
 	System.out.println(test());
				
	}
public static String test(){
	 int b = 7;	 	//base
	 int e = 181; 	//exponent
	 int m = 561;	//mod
	 
	 return "7^181mod561 = " + exp(b,e,m);
}
public static int exp(int base, int exp, int mod){
	int prod = 1;
	for(int i =1; i <= exp; i++){ 
		prod = prod*base;
		prod = prod%mod;
	}
	return prod;
}
}

