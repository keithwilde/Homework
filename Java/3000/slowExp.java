import java.math.*;
import java.applet.Applet;
public class slowExp extends Applet {
	public static void main(String [] args){
		BigInteger a = new BigInteger("1234567");
		BigInteger prod =  BigInteger.ONE;		//static sytax
		BigInteger modulus = new BigInteger("987654321");
		int b = 1234567890;
					// a^bmod modulus
		
		for(int i = 1;  i<= b; i ++){
			prod = prod.multiply(a);
			prod = prod.mod(modulus);
			
		}
		
		System.out.println("ans = " + prod.mod(modulus));
	}
}
