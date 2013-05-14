//
import java.math.BigInteger;
public class exponential {
	public static void main(String[] args){
		long start; //for timing
		long end;	
	/*
	BigInteger b = new BigInteger("123456789");	 	//base
	BigInteger e = new BigInteger("1234567890"); 	//exponent
	BigInteger m = new BigInteger("987654321");		//mod
	
	
	BigInteger b = new BigInteger("1234567890");	 
	BigInteger e = new BigInteger("12345678901"); 	
	BigInteger m = new BigInteger("987654321");		
	*/ 
	
	
	BigInteger b = new BigInteger("1234567890");	 
	BigInteger e = new BigInteger("123456789012"); 	
	BigInteger m = new BigInteger("987654321");		
	 
	
	start = System.currentTimeMillis();
	System.out.println(exp(b,e,m).toString());
	end = System.currentTimeMillis();
	System.out.println("Algorithm takes: " +((end-start)*.001) + " seconds");
	
	
				
	}
public static BigInteger exp(BigInteger base, BigInteger exp, BigInteger mod){
	BigInteger prod = BigInteger.ONE;
	for(int i =1; i <= exp.intValue(); i++){ 
		prod = prod.multiply(base);
		prod = prod.mod(mod);
	}
	return prod;
}
}

