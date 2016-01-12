package stack;

public class DriverStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Removing an element to the stack:");
		try {
			stack.pop();
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.println("Adding 1 to the stack:");
		stack.push(1);
		System.out.println(stack.toString() + "\n");
		
		System.out.println("Adding 2, 3, 4 and 5 to the stack:");
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.toString() + "\n");
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Removing an element to the stack:");
			try {
				System.out.println(stack.pop() + " was removed of the stack");
			} catch (EmptyStackException e) {
				System.out.println(e.getMessage() + "\n");
			}
			System.out.println("The Stack is: ");
			System.out.println(stack.toString() + "\n");
		}
	}

}
