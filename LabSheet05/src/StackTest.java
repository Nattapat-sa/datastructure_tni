import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		//StackArrayBased num_stack = new StackArrayBased(5);
         StackLinkedList num_stack = new StackLinkedList();
		num_stack.push(15);
		num_stack.push(16);
		num_stack.push(17);
		
		System.out.println("Pop stack = " + num_stack.pop());
		System.out.println("Pop stack = " + num_stack.peek());
		System.out.println("Pop stack = " + num_stack.peek());
		num_stack.popAll();
		System.out.println(num_stack.peek());

		// Data in stacks -> [15,16,17]
		//System.out.println("Pop stack = " + num_stack.pop());
		//System.out.println("Peek stack = " + num_stack.peek());
		//System.out.println("Pop stack = " + num_stack.pop());
		//System.out.println("Peek stack = " + num_stack.peek());
		//System.out.println("Pop stack = " + num_stack.pop());
		//System.out.println("Peek stack = " + num_stack.peek());
		//num_stack.popAll();
		//System.out.println("Peek stack = " + num_stack.peek());
		Stack<Integer> stacks = new Stack<>();
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		System.out.println(stacks);
		while (!stacks.empty()) {
			System.out.println(stacks.pop());
		}

	}
	

}
