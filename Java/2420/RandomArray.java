
import java.util.*;


public class RandomArray {
    int[] intArray;
    Random generator = new Random();
    public RandomArray(int n){
        intArray = new int [n];
       for(int i = 0; i<n; i++){
        intArray[i]= generator.nextInt(1000001);
    }
    }
    
    
    public  String print(){
        
        String output  = "";
        
        
        for(int i = 0; i<intArray.length; i++){
         output += intArray[i] + "\n";
        }
        
        return output;
                
        
	  
    }
}
