import java.util.Stack;

public class Stack01 {
	public static void main(String[] args) {
		int[] cars = { 1, 2, 3, 4, 5 };
		Stack<Integer> stacks = new Stack<>();
		for (int i = 0; i < cars.length; i++) {

			System.out.println("Siding onto dead-end track: Car " + cars[i]);
			stacks.push(cars[i]);

		}
		System.out.println("\nStack -> " + stacks + "\n");
		while (!stacks.isEmpty()) {
			int removedCar = stacks.pop();
			System.out.println("Exiting a dead-end: Car " + removedCar);
		}

		System.out.println("\nStack -> " + stacks);
	}

}
