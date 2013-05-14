
import java.util.*;
import java.applet.Applet;
public class subsets extends Applet {
	public static void main(String[] args){
		System.out.println(test());
	}
	public static String test(){
		String result = "For n=4 the subsets are: \n" + pSet(4);
		
		
		return result;
	}
		public static String pSet(Integer n){
			String str1 = "";
			
			for(int i = 1; i <= n; i ++){
				str1 +=i;
				
			}
			char [] array1 = str1.toCharArray();
			
			ArrayList list = new ArrayList();
			int length = array1.length;
			
			int totalElements = (int) Math.pow(2, length);
			
			for(int i = 0; i<totalElements; i ++){
				String  binString = Integer.toBinaryString(i);
				int stringValue = binString.length();
				
				
				String subset = binString;
				
				for(int j = stringValue; j < length; j++){
					subset = "0" + subset;
				}
				ArrayList innerSet = new ArrayList();
				for (int k = 0; k < subset.length(); k++) {
	                if (subset.charAt(k) == '1')
	                        innerSet.add(array1[k]);
	        }
				list.add(innerSet);
			}
			
			
			return list.toString();
		}
	
	
}
