import java.applet.Applet;
public class TestList2 extends Applet{
    
    public static String Tester(){
        String result = "";
        String myString1 = "This is the first string";
        String myString2 = "This is the second string";
        Character myChar = 'G';
        int num1 = 1234;
        int num2 = 43456;
    
        List myList = new List();
        myList.insertAtBack(myString1);
        myList.insertAtBack(myString2);
        myList.insertAtBack(myChar);
        result += "Initial list: \n" + myList.print() + "\n";
    
        myList.insertAtBack(num1);
    
        result += "List after 1 insertion: \n" + myList.print() + "\n";
        myList.insertAtBack(num2);
    
        result += "List after 2 insertions: \n" + myList.print() + "\n";
   
        myList.removeFromBack();
        result += "list after 1 removal: \n" + myList.print() + "\n";
        myList.removeFromBack();
        myList.removeFromBack();
    result += "list after 3 removals: \n" + myList.print() + "\n";
    
    return result;
    
    }
    
   
}
