import java.applet.Applet;

public class BstTest extends Applet {
   
    public static String test(){
        String result = "";  
        RandomArray  myArray = new RandomArray(100);
        result += "100 Random Numbers: \n" + myArray.print();
        Tree myTree = new Tree(myArray.intArray[0]);
        for(int i=1; i< myArray.intArray.length; i ++ ){
            myTree.insertNode(myTree.root, myArray.intArray[i]);
        }
         result += "\n\nAfter sorting : \n" + myTree.inorderTraversal(myTree.root);
      
        
        
        return result;
      
    }
}
