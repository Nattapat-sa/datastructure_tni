import java.util.Scanner;

public class BSTApp1 {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
		
		//no.3
		System.out.println("Minimum Node is "+tree.findMinimum(tree.getRoot()).data);
		System.out.println("Maximum Node is "+tree.findMaximum(tree.getRoot()).data);
		
		//no.5
		int target = 40;
		System.out.println("Is "+target+" in BST => "+tree.findSpecificData(target));
		int target1 = 15;
		System.out.println("Is "+target1+" in BST => "+tree.findSpecificData(target1));
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Input the number : ");
		int target2 = scan.nextInt();
		System.out.println("Is "+target2+" in BST "+tree.findSpecificData(target2));*/
		
		//no.7
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent is "+tree.getParent().data);
		System.out.println("Delete Node  is "+tree.getDeleteNode().data);
		
		//no.9
		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
		
		
	}
	

}
