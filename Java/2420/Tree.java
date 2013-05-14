//basic tree class
public class Tree {
	
	public TreeNode root;
	
	public Tree(int n){
		root = new TreeNode(n);
	}

	public void insertNode( TreeNode t, int d){
		if(d < t.getData()){
			if(t.getLeft() == null){
				t.setLeft(new TreeNode(d));
			}
			else{
				insertNode(t.getLeft(), d);
			}
		}
		else if(d > t.getData()){
			if(t.getRight() == null){
				t.setRight(new TreeNode(d));
			}
			else{
				insertNode(t.getRight(), d);
			}
				
			}
			
		}
	
	public String inorderTraversal (TreeNode node){
		
		if (node == null){
			return "";
		}
		
		return inorderTraversal(node.getLeft())+
		node.getData() + "\n" + inorderTraversal(node.getRight());
	}
	

}
