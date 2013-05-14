//test driver for node class
import java.applet.Applet; 
import java.math.*;
 
public class TestNode extends Applet{

public static void main(String args[]){
    TestNode.Test();
}
	
    public static String Test(){
        String result = "";       
        Node currentClass = new Node("Senior"); 
	Node major = new Node("Computer Science", currentClass);
	Node firstName = new Node("Keith", major);
	Node lastName = new Node("Wilde" ,firstName);
        result +="List \n \n" + lastName.nodeToString();
               
        int number = 1234;
        boolean myBool = true;
       
        Node num = new Node(number);
        Node bool = new Node(myBool,num);
        currentClass.setNext(bool);
               
        result += " \nList after Adding a boolean and an int \n \n" + lastName.nodeToString();
             
        return result;
               }
	
		

	}
      

