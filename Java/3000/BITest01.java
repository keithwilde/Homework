//bigint methods
import java.math.*;
import java.util.*;
public class BITest01 {
	
	
	public static void main(String[] args){
		Random rand = new Random();
		BigInteger a = new BigInteger(8,rand);
		BigInteger b = new BigInteger(8,rand);
		BigInteger n = new BigInteger(8,rand);
		
		//something big to test better prime
		BigInteger m = new BigInteger(1024, rand);
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("n =" + n);
		
		//now look at binary string
		
		System.out.println("Binary string for exponent b=" + b.toString(2)); //for exponential mod
		
		// to look at bitlength
		
		System.out.println("Bit length of a =" + a.bitLength()); //defined it as 8, can pad to needed length
		
		//gcd of a and b
		
		System.out.println("gcd of a and b ="+ a.gcd(b));
		
		//probable prime
		
		System.out.println("is the modulus,m, prime? " + m.isProbablePrime(20) ); //1 in million certainty
	
		//set up a couple more to test
		
		BigInteger c = new BigInteger("139");
		BigInteger d = new BigInteger("212");
		//modular exponentiation
		System.out.println("C ^d mod n= " + c.modPow(d,n)); //(exponent, modulus). 
		
		//inverse
		
		System.out.println("The inverse of cmod d =" + c.modInverse(d));
		//verify inverse take c * inverse
		System.out.println("Check:" +  (c.multiply(c.modInverse(d))).mod(d)); //
		
		//instead of hunting for primes, next probable prime
		
		System.out.println("Here is a good way to pick a big prime:" + m.nextProbablePrime()); //increases value until prime found
		
		System.out.println("Here is a good way to pick a small prime:" + n.nextProbablePrime());
		
	}
}
