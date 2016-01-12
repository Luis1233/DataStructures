package queue;

import doublyLinkedList.DoublyLinkedList;
import doublyLinkedList.EmptyListException;

public class QueueDoublyLinked<T> {
	
	private DoublyLinkedList<T> queue;
	
	/** ====================== Constructors =========================== */
	
	public QueueDoublyLinked() {
		queue = new DoublyLinkedList<>();
	}
	
	public QueueDoublyLinked(T data) {
		queue = new DoublyLinkedList<>(data);
	}
	
	/** ====================== Methods =========================== */

	public void enqueue(T data) {
		queue.addFirst(data);
	}
	
	public T dequeue() throws EmptyListException {
		return queue.removeLast();
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
