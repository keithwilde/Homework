//Basic binary tree node
public class TreeNode {

	private int data; 
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int n){
		data = n;
		left = null;
		right= null;
	}
	
	public TreeNode(int n, TreeNode leftNode, TreeNode rightNode){
		data = n;
		left = leftNode;
		right = rightNode;
	}
	
	public int getData(){
		return data;
	}
	
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
	
	public void setData(int n){
		data = n;
	}
	
	public void setLeft (TreeNode leftNode){
		left = leftNode;
	}
	
	public void setRight(TreeNode rightNode){
		right = rightNode;
	}
}
