//Stacks implemented by inheritance from List

public class Stack extends List {
	
	public Stack(){
		super("My stack");
	}
        
        public Stack(String s){
            super(s);
        }
	
	public void push (Object o ){
		super.insertAtFront(o);
	
	}
	
	public Object pop (){
		if (isEmpty()){
                    return null;
		}
		else {
                    return super.removeFromFront();
		}
	}
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public String print(){
		return super.print();
	}
	
        public static String reverse (){
            String result = "";
            Stack myStack = new Stack("");
            result += "Pushing 10 strings onto stack \n";
            for(int i =1; i <11; i ++){
                myStack.push(("String" + i));
                result += "String" + i + " ";
            }
            
            result += " \n\nRemoving all objects from stack\n";
            
            while(!myStack.isEmpty()){
                result += myStack.pop() + " ";
            }
            return result;
        }
       

}
