package interfaces;

import linkedList.EmptyListException;

public interface ListInterface<E> extends DataStructuresInterface<E> {
	
	public void addFirst(E data);
	
	public void addEnd(E data);
	
	public E removeFirst() throws EmptyListException;
	
	public E removeLast() throws EmptyListException;
	
	public E getElement(int index) throws IndexOutOfBoundsException;

}
