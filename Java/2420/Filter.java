import java.io.*;
import java.util.*;

//implemented by using priority queue
public class Filter {
	public static void main (String[] args){
		
		String data = textData.data;
		String[] wordArray = data.split(" \\s*"); //removes spaces
		List<String> aList = Arrays.asList(wordArray); //generics, interface List
		ArrayList<String> wordList = new ArrayList<String>(aList);
		
		Iterator<String> it = wordList.iterator();
		
		while (it.hasNext()){	//
			if(cond(it.next())) { 
				it.remove();
			}
		}
		/*for (String s: wordList){
			System.out.println(s);
		}
		
		System.out.println("wordList now is this big:"+ wordList.size());
		*/
		
}
public static boolean cond (String str){
	return (str.length() < 5);
}
}
