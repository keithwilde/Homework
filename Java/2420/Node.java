//basic node class
public class Node {
	private Object data;
	private Node next;
	
	//constructor
	public Node (Object obj, Node nextNode){
		data = obj;
		next = nextNode;
	}
	//constructor
	public Node(Object obj){
		data = obj;
		next = null;
	}
	
	public void setObject (Object obj){
		data = obj;
		
	}
	
	public void setNext (Node nextNode){
		
            next = nextNode;
	}
	
	public Object getObject (){
		return data;
	}
	
	public Node getNext () {
		return next;
	}
	
	public void print(){
		System.out.println(this.getObject());
		if(next != null){
			next.print();
		}
	}
        
        public String nodeToString(){
          String newline = "\n";
          String result = "";
           
		Node current = this;
		while( current != null) {
			result += current.getObject() + newline;
			current = current.getNext();
		}
		
		return result;
        }
	
}






