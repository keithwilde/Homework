import java.math.*;
public class testthing {
	public static void main(String[] args){
		BigInteger e = new BigInteger("17");
		
		////////////////
		BigInteger m = new BigInteger("24");
		//////////////////////
		
		BigInteger n = new BigInteger("2537");
		
		
		
		//System.out.println(m.modPow(e, n));
		BigInteger enc = new BigInteger("1889");
		BigInteger inv = new BigInteger("1433");
		BigInteger phi = new BigInteger("2436");
		System.out.println(enc.modPow(inv, n));
	
	}
}
