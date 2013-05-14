import java.applet.Applet;
import java.math.*;

public class TestList extends Applet{
      
	
        public  static String something(){
            String result = "";
            BigInteger bigInt = BigInteger.TEN;
            String myString = "this is a group of words";
            Character myChar = 'c';
            int myInt = 1234321; 
        
            List newList = new List("My List");
            newList.insertAtFront(bigInt);
            newList.insertAtFront(myString);
            newList.insertAtFront(myChar);
            newList.insertAtFront(myInt);
            
            result = newList.print() + "\n";
            
            newList.removeFromFront();
            
            result += "After 1 removal \n" + newList.print() + "\n";
            
            newList.removeFromFront();
            result += "After 2 removals \n"+ newList.print()+ "\n";
            
            newList.removeFromFront();
            result += "After 3 removals \n"+ newList.print()+ "\n";
            
            newList.removeFromFront();
            result += "After 4 removals  \n"+ newList.print()+ "\n";
            
            return result;
	
        }
       

}
