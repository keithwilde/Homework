//basic tree class for Strings
public class StringTree {
	
	public StringTreeNode root;
	
	public StringTree(String n){
		root = new StringTreeNode(n);
	}

	public void insertNode( StringTreeNode t, String d){
		if( t.getData().compareTo(d) >0){
			if(t.getLeft() == null){
				t.setLeft(new StringTreeNode(d));
			}
			else{
				insertNode(t.getLeft(), d);
			}
		}
		else if(t.getData().compareTo(d) <0){
			if(t.getRight() == null){
				t.setRight(new StringTreeNode(d));
			}
			else{
				insertNode(t.getRight(), d);
			}
				
			}
			
		}
	
	public String inorderTraversal (StringTreeNode node){
		
		if (node == null){
			return "";
		}
		
		return inorderTraversal(node.getLeft())+
		node.getData() + "\n" + inorderTraversal(node.getRight());
	}
	

}
