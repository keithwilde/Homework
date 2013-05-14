//test driver for stack class

import java.math.*;
import java.applet.Applet;

public class TestStack extends Applet{
	
	public static void main(String[] args){
            
        }
	public static String test () { 
		String result = "";
		String newLine = "\n";
                int count = 0;
		
		Stack objStack = new Stack();
		BigInteger bi = new BigInteger("1234414141441414412354");
		String s = "now is the something";
		
		objStack.push(bi);
		objStack.push(s);
               
                //creating 4 new objects
                Character myChar = 'k';
                String myStr = "These are words";
                int num = 123456;
                BigInteger bi2 = new BigInteger("10987654321");
                
                //adding the objects to the stack
                objStack.push(myChar);
                objStack.push(myStr);
                objStack.push(num);
                objStack.push(bi2);        
	
                result += "Initial stack " + newLine + newLine;
		result += objStack.print() + newLine;
                
                while(!objStack.isEmpty()){
                    objStack.pop();
                    count++;
                    result += newLine + "Stack after " + count + " removal"+ newLine;
                    result += objStack.print();
                }
		return result;
	}
        
       
}
