import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Practice03 {

	public static void main(String[] args) {
		String original ="Hello World";
		
		
		System.out.println("Original => "+original);
		System.out.println("Reverse  => " + reverseCharacter(original));

	}
	public static String reverseCharacter(String original) {
		 Deque<Character> stack = new ArrayDeque<Character>();
		 // Push every character of original onto the stack
	        for (int i = 0; i < original.length(); i++) {
	            stack.push(original.charAt(i));
	        }
	 
	        // Pop characters off the stack (LIFO order) to build the reversed string
	        StringBuilder reversed = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversed.append(stack.pop());
	        }
	        //System.out.println(reversed.toString());
	        return reversed.toString();
	    }

	}
	

