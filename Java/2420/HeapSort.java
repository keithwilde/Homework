import java.io.*;
import java.util.*;

//implemented by using priority queue
public class HeapSort {
	public static void main (String[] args){
		
		String data = textData.data;
		String[] wordArray = data.split(" \\s*"); //removes spaces
		List<String> wordList = Arrays.asList(wordArray); //generics, interface List
		Queue<String> queue = new PriorityQueue<String>(wordList); //interface Queue
		/*while (!queue.isEmpty()){	//
			System.out.println(queue.poll());
		}
		*/
		
}
}
