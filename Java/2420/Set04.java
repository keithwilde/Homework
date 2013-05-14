//May be problems with this
import java.io.*;
import java.util.*;


public class Set04 {
	public static void main (String[] args){
		
		String data = textData.data;
		String[] wordArray = data.split(" \\s*"); //removes spaces
		List<String> aList = Arrays.asList(wordArray); //generics, interface List
		TreeSet<String> setA = new TreeSet<String>(aList);
		Iterator<String> it;
		
		it = setA.iterator();
		while (it.hasNext() ){
			if (condAB(it.next()) ){
				it.remove();
			}
		}
		
		
		for (String s: setA){
			System.out.println(s);
		}
		
		
	
		
		System.out.println("our set has this many elements:"+ setA.size());
		
		

}
public static boolean condAB(String str){
	String s = str.toLowerCase();
	if ( s.compareTo("c") >= 0) {		//all the words in the list that start with a or b not in list
		return true;
	}
	return false;
}
public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B){
	A.addAll(B);
	return A;
}
}

