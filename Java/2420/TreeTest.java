//
public class TreeTest {

	
	public static void main(String[] args) {
		Tree myTree = new Tree(50);
	
		myTree.insertNode(myTree.root,25);
		myTree.insertNode(myTree.root, 75);
		
		System.out.println(myTree.root.getLeft().getData());

	}

}
