import java.math.BigInteger;
import java.util.Random;
import java.applet.Applet;

public class bigIntExp extends Applet {
	public static void main(String [] args){
		System.out.println(test());
	}
	//tests modular exponentiation 5 times
	public static String test(){
		String result = "";
		Random rand = new Random();
		
		for(int i = 1; i<=5 ; i ++){
			
			BigInteger base = new BigInteger(1024,rand);
			BigInteger exp = new BigInteger(1024,rand);
			BigInteger mod = new BigInteger(1024,rand);
			result += "Case " + i + " result is: \n";
			result +=modExp(base,exp,mod).toString();
			result += "\n\n";
		}
		
		return result;
	}
	//modular exponentiation using BigIntegers
	public static BigInteger modExp(BigInteger b, BigInteger e, BigInteger m){
		BigInteger d = BigInteger.ONE;
			
		String bin = e.toString(2);	
			
			for(int i = 0; i <bin.length(); i ++){
				d = d.multiply(d).mod(m);
				if(bin.charAt(i) == '1'){
					d = d.multiply(b).mod(m);
				}	
			}
			
			return d;
	}
}