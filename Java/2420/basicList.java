//basic list class

public class basicList {
	private Node firstNode;
	private Node lastNode;
	private String name;
	
	public basicList () {
		name = "default list";
		firstNode = lastNode = null;   //empty list
		
	}
	
	public basicList (String s){
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
	
	// may not work correctly
	public void insertAtBack (Object insertItem){
		if(isEmpty()){
			firstNode = lastNode = new Node(insertItem);
		}
		else {
			lastNode.setNext(new Node(insertItem,null));
		}
	}
	
	public boolean isEmpty(){
		return (firstNode == null);		
	}
	
	public Object removeFromFront(){
		Object removeItem = null;
		if (isEmpty()){								//What if we have an empty list?
			removeItem = "This list is empty";
			return removeItem;
		}
		removeItem = firstNode.getObject();
		
		if(firstNode.equals(lastNode)){				//What if there is only one node in list
			firstNode = lastNode = null;
		}
		else {										//general case
			firstNode = firstNode.getNext();
		}
		return removeItem;
		
	}
	//in most cases it is best to print a string
	public String print() {
		String result = "";
		String newline = "/n";
		if (isEmpty()){
			result += "Empty " + name + newline;
			return result;
		}
		
		result +=name + " contains: " + newline;
		Node current = firstNode;
		while( current != null) {
			result += current.getObject() + newline;
			current = current.getNext();
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
