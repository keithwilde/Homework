//Implementing a queue using inheritance
//change this to composition
public class Queue extends basicList {
	
	public Queue(){
		super("myqueue");
	}
	
	public void enqueue (Object o){
		super.insertAtBack(o);
	}
	
	public Object dequeue (){
		if (isEmpty()){
			return null;
		}
		return super.removeFromFront();
	}
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public String print () { 
		return super.print();
	}
	public static void main(String[] args) {
		

	}

}
