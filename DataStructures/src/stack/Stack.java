package stack;

import linkedList.EmptyListException;
import linkedList.List;

public class Stack<T> {
	
	private List<T> stack;
	
	/** ====================== Constructors =========================== */
	
	public Stack() {
		stack = new List<>();
	}
	
	public Stack(T data) {
		stack = new List<T>(data);
	}

	/** ====================== Methods =========================== */

	public void push(T data) {
		stack.addFirst(data);
	}
	
	public T pop() throws EmptyStackException {
		try {
			return stack.removeFirst();
		} catch(EmptyListException e) {
			throw new EmptyStackException();
		}
	}
	
	public void clear() {
		stack.clear();
	}
		
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int getSize() {
		return stack.getSize();
	}
	
	public String toString() {
		return stack.toString();
	}
}
