package queue;

public class EmptyQueueException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public EmptyQueueException() { super("Queue is Empty"); }
	public EmptyQueueException(String message) { super(message); }
	public EmptyQueueException(String message, Throwable cause) { super(message, cause); }
	public EmptyQueueException(Throwable cause) { super(cause); }
	
}