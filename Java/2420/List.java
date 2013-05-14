//basic list class
import java.applet.Applet;

public class List extends Applet{
	private Node firstNode;
	private Node lastNode;
	private String name;
	
       
        public static String Test(){
            String result = "";
            List myList = new List("Squares");
            for(int i = 1; i<11; i++){
                myList.insertAtBack((i*i));
            }
            myList.lastNode.setNext(myList.firstNode);
            System.out.println(myList.print());
            result = myList.print();
            
            return result;
            
        }
        
	public List () {
		name = "default list";
		firstNode = lastNode = null;   //empty list
		
	}
	
	public List (String s){
		name = s;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront (Object insertItem){
		if (isEmpty()) {
			firstNode = lastNode = new Node (insertItem);
		}
		else {
			firstNode = new Node(insertItem, firstNode);
		}
	}
	
	
	public void insertAtBack (Object insertItem){
		Node currentNode = null;
                if(isEmpty()){
			firstNode = lastNode = new Node(insertItem);
		}
                else if (lastNode == firstNode){
                    lastNode = new Node(insertItem,null);
                    firstNode.setNext(lastNode);
                }
                else {
                    currentNode = lastNode;
                    lastNode = new Node(insertItem, null);
                    currentNode.setNext(lastNode);
		}
	}
        
        public Object removeFromBack(){
            Node currentNode = null;
            Object removeItem = null;
            if (isEmpty()){								
			removeItem = "This list is empty";
                        return removeItem;
		}
            if(firstNode.equals(lastNode)){				
			firstNode = lastNode = null;
                        
		}
            else{
                currentNode = firstNode;
                while(currentNode.getNext() != lastNode){
                    currentNode = currentNode.getNext();
                }
                
                removeItem = lastNode;
                currentNode.setNext(null);
                lastNode = currentNode;
            }
            
            return removeItem;
        }
	
	public boolean isEmpty(){
		return (firstNode == null);		
	}
	
	public Object removeFromFront(){
		Object removeItem = null;
		if (isEmpty()){								
			removeItem = "This list is empty";
			return removeItem;
		}
		removeItem = firstNode.getObject();
		
		if(firstNode.equals(lastNode)){				
			firstNode = lastNode = null;
		}
		else {										
			firstNode = firstNode.getNext();
		}
		return removeItem;
		
	}
	
	public String print() {
		String result = "";
		String newline = "\n";
                int count = 0;
		if (isEmpty()){
			result += "Empty " + name + newline;
			return result;
		}
		
		result +=name + " contains: " + newline;
		Node current = firstNode;
                
		while( current != null && count !=2 ) {
			result += current.getObject() + newline;
			current = current.getNext();
                        if(current == lastNode){
                            count++;
                            if(count ==2 ){
                                result += current.getObject() + newline;
                            }
                            
                        }
		}
		
		return result;
	}
	

	
	
	
}
