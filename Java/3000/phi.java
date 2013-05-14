import java.util.*;
import java.applet.Applet;
@SuppressWarnings("serial")
public class phi extends Applet {
	public static void main(String[] args){

		System.out.println(tester1());
}
	//part 1 of assignment
	public static String tester1(){
		return "it worked";
		//phi(n) for n=2 to n = 1000
		//String result = "";
		//ArrayList<Integer> list;
		//for(int n =2; n <=1000; n ++){
			//result += "phi("+n+")= " +phiFunction(n) + "\n";
	//}
		//return result;
		
	}
	
	//part 2 of assignment
	/*public static String tester2(){
		String result ="";
		int [] numlist = {2,3,5,7,11,13,17,19,23,29};
		
		
		for(int i =0; i <numlist.length-1; i++){
			result += "Phi("+ numlist[i] + ") =" + phiFunction(numlist[i]) + "\n";
		}
		result += "\n";
		int p;
		int q;
		
		for(int j = 0; j < numlist.length; j++){
			p = numlist[j];
			for(int k = j; k<numlist.length; k ++){
				q = numlist[k];
				
				if(p!=q){
				result += "For p=" + p + " q=" + q + " ";
				result += "phi(" + p + "*" + q + ")=" + phiFunction(p*q) + "  ";
				result += "phi(" + p + "-1)*" + "phi(" + q + "-1) =" + (phiFunction(p) * phiFunction(q)) + "\n";
				}
			}
		}
		
			
		
		
		
		return  result;
	}
	public static int phiFunction(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<n; i++){
			if(gcd(i,n) ==1){
				list.add(i);
			}
		}
		
		return list.size();
	}
	
	public static int gcd(int n, int m){
		if (m == 0){
			return n;
		}
		return gcd(m,n%m);
	}
*/
}
