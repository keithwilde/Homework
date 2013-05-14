// Test the efficiency of Euclid's algorithm

import java.math.*;
import java.util.*;

public class euclid {
	public static int count = 0;
	
	public static void main (String[] args){
		long start; //for timing
		long end;
		Random rand = new Random();
		BigInteger n = new BigInteger(2048, rand);			//passing bits(600 digits in this case and rand
		BigInteger m = new BigInteger(2048, rand);
		System.out.println("n =" + n);
		System.out.println("m =" + m);
		start = System.currentTimeMillis();				//timing
		System.out.println("gcd(m,n) = " + euclid(n,m));
		end = System.currentTimeMillis();				//timing
		System.out.println("count = " + count);
		
		
		
		System.out.println("Computation Time: " + (end-start)+ " miliseconds");
		
	}
	
	public static BigInteger euclid(BigInteger n, BigInteger m){		//gcd, reduce and switch mod each time
		++count; //
		if (m.compareTo(BigInteger.ZERO) == 0 ){
			return n;
		}
		return euclid(m,n.mod(m));
	}
}
