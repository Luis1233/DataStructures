package stack;

public class EmptyStackException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public EmptyStackException() { super("Stack is Empty"); }
	public EmptyStackException(String message) { super(message); }
	public EmptyStackException(String message, Throwable cause) { super(message, cause); }
	public EmptyStackException(Throwable cause) { super(cause); }
	
}