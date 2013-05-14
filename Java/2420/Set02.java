//Treeset
import java.io.*;
import java.util.*;


public class Set02 {
	public static void main (String[] args){
		
		String data = textData.data;
		String[] wordArray = data.split(" \\s*"); //removes spaces
		List<String> aList = Arrays.asList(wordArray); //generics, interface List
		TreeSet<String> ts = new TreeSet<String>(aList);
		
		for (String s: ts){
			System.out.println(s);
		}
		
		
	
		
		System.out.println("our set has this many elements:"+ ts.size());
		
		
}
public static boolean cond (String str){
	return (str.length() < 5);
}
}
