import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class TraversePostorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();
		Queue<Integer> queue = new ArrayDeque<Integer>();

		stack.push(node);
		
		while (!stack.isEmpty()) {
			Node curr = stack.pop();
			queue.offer(curr.data);
			if(curr.left != null) {
				stack.push(curr.left);
			}
			if(curr.right != null) {
				stack.push(curr.right);
			}
			
		}
		while(!queue.isEmpty()) {
			list.addFirst(queue.poll());
		}
		
		return list;
	}
}