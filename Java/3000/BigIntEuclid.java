import java.math.BigInteger;


public class BigIntEuclid {
	public static BigInteger euclid(BigInteger n, BigInteger m){		
		
		if (m.compareTo(BigInteger.ZERO) == 0 ){
			return n;
		}
		return euclid(m,n.mod(m));
	}
}
