
public class TreeApp2 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("Binary Tree from createTree4()");
		System.out.println("-------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("-------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("-------------------");
		
		BinaryTree t1 = new BinaryTree();
		t1.createTree5();
		t1.printTree(t1.getRoot(), 0);
		
		System.out.println("-------------------");
		System.out.println("Binary Tree from createTree6()");
		System.out.println("-------------------");
		
		BinaryTree t2 = new BinaryTree();
		t2.createTree6();
		t2.printTree(t2.getRoot(), 0);
		

	}

}