//A stack based on composition
//We'll declare a prive Listobject then only make accessible the methods we need
public class Stack2 extends basicList{

	private basicList s;
	
	public Stack2(){
		s = new basicList("MyStack");
	}
	
	public void push (Object o){
		s.insertAtFront(o);
	}
	
	public Object pop() {
		if(isEmpty()){
			return null;
		}
		return s.removeFromFront();
	}
	
	public boolean isEmpty (){
		return s.isEmpty();
	}
	
	public String print(){
		return s.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
