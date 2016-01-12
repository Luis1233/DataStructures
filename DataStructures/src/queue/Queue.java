package queue;

import linkedList.EmptyListException;
import linkedList.List;

public class Queue<T> {
	
	private List<T> queue;
	
	/** ====================== Constructors =========================== */
	
	public Queue() {
		queue = new List<>();
	}
	
	public Queue(T data) {
		queue = new List<>(data);
	}
	
	/** ====================== Methods =========================== */

	public void enqueue(T data) {
		queue.addFirst(data);
	}
	
	public T dequeue() throws EmptyListException {
		try {
			return queue.removeLast();
		} catch(EmptyListException e) {
			throw new EmptyQueueException();
		}
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void clear() {
		queue.clear();
	}
	
	public int size() {
		return queue.getSize();
	}
	
	public String toString() {
		return queue.toString();
	}

}
