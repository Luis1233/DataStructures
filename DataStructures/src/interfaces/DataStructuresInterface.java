package interfaces;

public interface DataStructuresInterface<E> {
	
	public void add(E data, int position) throws IndexOutOfBoundsException;
	
	public E remove(int position) throws IndexOutOfBoundsException;
	
	public int getSize();
	
	public boolean isEmpty();
	
	public void clear();
	
}
