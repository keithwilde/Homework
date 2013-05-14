//using sets: a collection of unique items
//HashSets and TreeSets
//HashSets implement sets using hashtables:no order
//TreeSets implement sets using binary search trees: order is built into it
import java.io.*;
import java.util.*;


public class Set01 {
	public static void main (String[] args){
		
		String data = textData.data;
		String[] wordArray = data.split(" \\s*"); //removes spaces
		List<String> aList = Arrays.asList(wordArray); //generics, interface List
		HashSet<String> hs = new HashSet<String>(aList);
		
		/*for (String s: hs){
			System.out.println(s);
		}*/
		ArrayList<String> wordList = new ArrayList<String>(aList);
		
		Iterator<String> it = wordList.iterator();
		
	
		
		//System.out.println("our set has this many elements:"+ hs.size());
		
		
}
public static boolean cond (String str){
	return (str.length() < 5);
}
}
