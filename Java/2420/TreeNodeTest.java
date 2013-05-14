// test driver for TreeNode class
import java.math.*;
public class TreeNodeTest {


	public static void main(String[] args) {
		int num1 = 1000;
		int num2 = 2000;
		int num3 = 3000;
		
		TreeNode childNode1 = new  TreeNode(num1);
		TreeNode childNode2 = new TreeNode(num2);
		TreeNode root = new TreeNode(num3, childNode1, childNode2);
		
		System.out.println(root.getData());
		System.out.println();
		System.out.println(root.getLeft().getData());
		System.out.println();
		System.out.println(root.getRight().getData());
		
	}

}
