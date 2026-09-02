
public class TreeApp3 {

	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.createTree5();
		t.printTree(t.getRoot(), 0);
		
		System.out.println("----------------------------");
		t.delete(50);
		System.out.println("Parent = "+t.parents.data);
		System.out.println("Delete Node ="+t.deleteNode.data);
		t.printTree(t.getRoot(), 0);
		

	}

}