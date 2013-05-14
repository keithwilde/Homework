//test driver for String Tree class
import java.applet.Applet;
public class StringTreeTest extends Applet{
   
        public static String treeTest(){
        String result = "Tree contains: \n\n";
        String [] myArray = {"Through", "our", "more", "than", "110", "year","history,","Southern", "Utah", "University", "has", "evolved", "from", 
            "a", "teacher", "training", "institution", "to", "its", "current"};
         
        StringTree myTree = new StringTree(myArray[0]);
        for(int i = 1; i<myArray.length; i++){
            myTree.insertNode(myTree.root, myArray[i]);
            
        }
        result += myTree.inorderTraversal(myTree.root);
        
        
       return result;
    }
    
}
