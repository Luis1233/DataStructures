package linkedList;

public class Node<T> {
	
	private Node<T> next;
	private T data;
	
	/** ====================== Constructors =========================== */
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(T data) {
		this(data, null);		
	}
	
	public Node() {
		this(null);
	}
	
	/** =============== Getters and setters methods =========================== */

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
