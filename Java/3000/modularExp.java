//(a^b)modn

public class modularExp {
	public static void main(String[] args){
		int a = 7;			//base b
		int b = 181;		//exponent e
		int n = 561;		//modulus m
		
		
		System.out.println(modexp(a,b,n));
	}
	
	public static int modexp(int a, int b, int n){			
		int d = 1;
		String bin = Integer.toBinaryString(b);
		
		System.out.println(bin);
		
		for(int i = 0; i <bin.length(); i ++){
			d = (d*d)%n;
			if(bin.charAt(i) == '1'){
				d = (d*a)%n;
			}
			System.out.println(d);
		}
	
	return d;
	}
}
