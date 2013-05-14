import java.math.*;
import java.util.*;
public class RSA {
	private static BigInteger p;
	private static BigInteger q;
	static BigInteger pq; 					//public key
	private static BigInteger phi;
	private static BigInteger e;
	private static BigInteger convertedStr;
	private static BigInteger encryptedStr;
	static BigInteger decryptedStr;
	private static BigInteger privateKey;
	
	
	
	
	public static void main(String[] args){
		
		String message = "  This is a group of words ";
		convertString(message);
		BigInteger n = getN();
		BigInteger e2 = getE();
		encrypt();
		System.out.println(decrypt());

}
	public static BigInteger getN(){		
		Random rand = new Random();
		
		BigInteger p1 = new BigInteger(500, rand);
		BigInteger p2 = new BigInteger(500,rand);
		p1 = p1.nextProbablePrime();
		p2 = p2.nextProbablePrime();
		
		
		
		while(p1.multiply(p2).toString().length() != 300 || Integer.parseInt((String) p1.multiply(p2).toString().substring(0, 3)) < 255){		//substring here first three and compare to 255
			p1 = new BigInteger(500, rand);
			p2 = new BigInteger(500,rand);
			p1 = p1.nextProbablePrime();
			p2 = p2.nextProbablePrime();
		}
		p = p1;
		q = p2;
		pq = p.multiply(q);
				
		 return pq;
	 }
	//encryption
	public static void encrypt(){
		encryptedStr = convertedStr.modPow(e, pq);
		privateKey = e.modInverse(phi(p,q));
	}
	
	//decryption, returns decrypted string
	public static String decrypt(){
		String result = "";
		decryptedStr = (encryptedStr.modPow(privateKey,pq));
		result = decryptedStr.toString();
		if(result.length() == 299){
			result = "0" + result;
		}
		String temp = "";
		char temp2;
	    for (int i = 0; i < result.length(); i += 3)
	    {
	    	temp2 = (char)(Integer.parseInt(result.substring(i, i + 3)));
	    	if(temp2 != 'Z'){
	    		temp += temp2;
	    	}
	    }
		return temp;
	}
	//gets the exponent e
	public static BigInteger getE(){
		Random rand = new Random();
		BigInteger e1 = new BigInteger(500,rand);
		while(e1.compareTo(p) == -1 & e1.compareTo(q) == -1 || e1.compareTo(pq) == 1 || phi(p,q).gcd(e1).compareTo(BigInteger.ONE) != 0 ) {
			e1 = new BigInteger(500,rand);
		}
		e = e1;
		return e1;
	}
	
	public static BigInteger phi(BigInteger a, BigInteger b){
		return a.subtract(BigInteger.ONE).multiply(b.subtract(BigInteger.ONE));
	}
	//converts string to big integer
	public static BigInteger convertString(String a){
		while(a.length() != 100){
			a = a + "Z";
		}
		String temp = "";
		String result = "";
	    for ( int i = 0; i < a.length(); ++i ) {
	       char c = a.charAt( i );
	       int j = (int) c;
	        temp = "" +j;
	       if(temp.length() != 3) {
	    	   temp = '0' + temp;
	       }
	       result = result + temp;
	       
	       }
		
		BigInteger temp2 = new BigInteger(result);
		convertedStr = temp2;
		return temp2;
	}
}
