//Basic binary tree node for Strings
public class StringTreeNode {

	private String data; 
	private StringTreeNode left;
	private StringTreeNode right;
	
	public StringTreeNode(String n){
		data = n;
		left = null;
		right= null;
	}
	
	public StringTreeNode(String n, StringTreeNode leftNode, StringTreeNode rightNode){
		data = n;
		left = leftNode;
		right = rightNode;
	}
	
	public String getData(){
		return data;
	}
	
	public StringTreeNode getLeft(){
		return left;
	}
	
	public StringTreeNode getRight(){
		return right;
	}
	
	public void setData(String n){
		data = n;
	}
	
	public void setLeft (StringTreeNode leftNode){
		left = leftNode;
	}
	
	public void setRight(StringTreeNode rightNode){
		right = rightNode;
	}
}
